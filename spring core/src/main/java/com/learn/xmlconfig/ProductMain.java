package com.learn.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {
    public static void main(String[] args) {
        // 1. Instantiate the spring IoC Container
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Get the bean information from the spring IoC
        Product product = applicationContext.getBean(Product.class);

        // 3. Use the bean
        System.out.println(product);
    }
}
