package com.learn.beanimport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("innerbean.xml");
        System.out.println(applicationContext.getBean("artist"));
    }
}
