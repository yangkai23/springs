package org.parkerInc.stereotypeconfApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	FlipKartController fc=context.getBean(FlipKartController.class);
	fc.purchase();
}
}
