plugins {
    java
    id("org.springframework.boot") version "3.1.4" apply false
    id("io.spring.dependency-management") version "1.1.3" apply false
}

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
            vendor.set(JvmVendorSpec.AMAZON)
        }
    }

    dependencies {
         annotationProcessor("org.projectlombok:lombok:_")
         compileOnly("org.projectlombok:lombok:_")

         testImplementation("org.junit.jupiter:junit-jupiter-api:_")
         testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:_")
    }
}