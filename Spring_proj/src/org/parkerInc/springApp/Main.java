package org.parkerInc.springApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		ICar car1=(ICar) context.getBean("audi");
		car1.drive();
		ICar car2=(ICar) context.getBean("bmw");
		car2.drive();
	}
}
