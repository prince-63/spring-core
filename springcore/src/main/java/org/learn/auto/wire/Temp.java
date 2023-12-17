package org.learn.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Temp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/learn/auto/wire/autowireconfig.xml");
		Emp emp1 = context.getBean("emp1", Emp.class);
		
		System.out.println(emp1);
	}

}
