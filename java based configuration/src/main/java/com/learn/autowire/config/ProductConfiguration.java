package com.learn.autowire.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    @Bean
    public Product product() {
        return new Product("A-282", "Laptop");
    }

    @Bean
    public Address address() {
        return new Address("titagarh", "Kolkata");
    }

    @Bean
    public User user() {
        return new User();
    }
}
