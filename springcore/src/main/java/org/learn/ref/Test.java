package org.learn.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/learn/ref/refconfig.xml");
		A a=(A) context.getBean("a");
		System.out.println(a);
	}

}
