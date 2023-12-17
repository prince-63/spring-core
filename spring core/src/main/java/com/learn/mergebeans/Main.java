package com.learn.mergebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mergebeans.xml");
        System.out.println(applicationContext.getBean(Details.class).getDetails());
    }
}
