package com.learn.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArtistMain {
    public static void main(String[] args) {
        // 1. Instantiate the spring IoC Container
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfiguration.class);

        // 2. Get the bean information from the IoC Container
        Artist artist = (Artist) applicationContext.getBean("artists");

        // 3. use Bean
        System.out.println(artist);
    }
}
