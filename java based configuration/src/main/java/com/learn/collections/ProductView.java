package com.learn.collections;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductView {
    @Autowired
    private Map<String, Product> products;

    public void view(){
        for (Map.Entry<String, Product> product : products.entrySet()) {
            System.out.println(product.getKey() + " => " + product.getValue());
        }
    }
}
