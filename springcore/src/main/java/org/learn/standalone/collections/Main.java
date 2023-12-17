package org.learn.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/learn/standalone/collections/config.xml");
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student.getFriends());
		System.out.println(student.getFriends().getClass().getName());
		System.out.println("------------------------------------------");
		System.out.println(student.getSkiils());
		System.out.println(student.getSkiils().getClass().getName());
		System.out.println("------------------------------------------");
		System.out.println(student.getDbconfig());
		System.out.println(student.getDbconfig().getClass().getName());
	}

}
