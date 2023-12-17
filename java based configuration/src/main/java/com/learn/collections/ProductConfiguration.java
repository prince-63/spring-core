package com.learn.collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    @Bean
    public Product product1() {
        return new Product("1", "Laptop");
    }

    @Bean
    public Product product2() {
        return new Product("2", "Desktop");
    }

    @Bean
    public Product product3() {
        return new Product("3", "Keyboard");
    }

    @Bean
    public Product product4() {
        return new Product("4", "Mouse");
    }

    @Bean
    public ProductView productView() {
        return new ProductView();
    }
}
