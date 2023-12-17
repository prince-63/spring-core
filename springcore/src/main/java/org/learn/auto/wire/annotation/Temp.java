package org.learn.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Temp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/learn/auto/wire/annotation/autowireconfig.xml");
		Emp emp1 = context.getBean("emp1", Emp.class);
		
		System.out.println(emp1);
	}

}
