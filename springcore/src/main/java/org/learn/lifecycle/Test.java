package org.learn.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/learn/lifecycle/lifecycle.xml");
		//Samosha s1 = (Samosha) context.getBean("s1");
		//System.out.println(s1);
		
		//Pepsi p1 = (Pepsi) context.getBean("p1");
		//System.out.println(p1);
		
		Example example = (Example) context.getBean("example");
		System.out.println(example);
		
		// application process close
		context.registerShutdownHook();
	}

}
