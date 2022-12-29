package org.parkerInc.autowiringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
	FlipkartController fc=(FlipkartController) context.getBean("fkc");
	fc.purchase();
}
}
