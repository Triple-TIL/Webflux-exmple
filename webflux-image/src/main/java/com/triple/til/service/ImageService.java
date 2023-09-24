package com.triple.til.service;

import com.triple.til.entity.common.Image;
import com.triple.til.repository.ImageReactorRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ImageService {

    private ImageReactorRepository imageRepository = new ImageReactorRepository();

    public Mono<Image> getImageById(String imageId) {
        return imageRepository.findById(imageId)
                .map(imageEntity ->
                        new Image(imageEntity.getId(), imageEntity.getName(), imageEntity.getUrl()
                        )
                );
    }

}
