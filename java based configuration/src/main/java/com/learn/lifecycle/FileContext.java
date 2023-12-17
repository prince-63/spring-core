package com.learn.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class FileContext {
    @PostConstruct
    public void init() {
        System.out.println("File is initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("File is closed.");
    }

    public void readFile() {
        System.out.println("File is reading.");
    }
}
