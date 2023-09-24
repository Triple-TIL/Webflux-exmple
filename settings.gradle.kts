pluginManagement {
    repositories {
        gradlePluginPortal()

        maven { setUrl("https://repo.spring.io/milestone") } // Spring milestones
        maven { setUrl("https://repo.spring.io/snapshot") } // Spring snapshots
    }

    plugins {
        id("de.fayard.refreshVersions") version "0.51.0"
    }
}

plugins {
    id("de.fayard.refreshVersions")
}

rootProject.name = "webflux-example"
include("webflux")
include("webflux-image")
