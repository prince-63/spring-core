package com.learn.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learn.scope")
public class ProductConfiguration {

    @Bean
    public Product mobile() {
        return new Product("1", "mobile");
    }

    @Bean
    public Product laptop() {
        return new Product("2", "laptop");
    }

    //@Bean
    public ProductList productList() {
        return new ProductList();
    }
}
