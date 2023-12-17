package com.learn.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfiguration {

    @Bean(name="artists")
    public Artist artist() {
        return new Artist("John", "Deo");
    }
}
