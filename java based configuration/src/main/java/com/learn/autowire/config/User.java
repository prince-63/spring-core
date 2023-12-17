package com.learn.autowire.config;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    @Autowired
    private Address address;
    @Autowired
    private Product product;

    @Override
    public String toString() {
        return "User{" +
                "address=" + address +
                ", product=" + product +
                '}';
    }
}
