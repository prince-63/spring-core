package com.learn.normal.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        System.out.println(applicationContext.getBean("product"));
        System.out.println(applicationContext.getBean("address"));
    }
}
