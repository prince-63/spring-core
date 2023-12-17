package com.learn.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        // 1. instance of product1
        Product product1 = applicationContext.getBean("mobile", Product.class);
        ProductList productList1 = applicationContext.getBean(ProductList.class);
        productList1.addProduct(product1);;
        System.out.println(productList1.getProduct());

        // 2. instance of product2
        Product product2 = applicationContext.getBean("laptop", Product.class);
        ProductList productList2 = applicationContext.getBean(ProductList.class);
        productList2.addProduct(product2);;
        System.out.println(productList2.getProduct());
    }
}
