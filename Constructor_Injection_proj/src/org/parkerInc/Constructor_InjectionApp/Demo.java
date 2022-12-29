package org.parkerInc.Constructor_InjectionApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	Mobile mobile=(Mobile) context.getBean("mob");
	System.out.println(mobile.hashCode());
	Mobile mobile2=(Mobile) context.getBean("mob");
	System.out.println(mobile2.hashCode());
}
}
