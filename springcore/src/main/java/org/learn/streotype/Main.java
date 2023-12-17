package org.learn.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/learn/streotype/config.xml");
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student);
		System.out.println(student.getAddress().getClass().getName());
	}

}
