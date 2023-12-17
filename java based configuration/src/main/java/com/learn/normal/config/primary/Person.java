package com.learn.normal.config.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    @Autowired
    @Qualifier("bike")
    private Vehicle vehicle;

    public void drive() {
        this.vehicle.drive();
    }
}
