package org.parkerInc.Constructor_InjectionApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	IOrganization comp1=(IOrganization) context.getBean("clarivate");
	comp1.work();
	IOrganization comp2=(IOrganization) context.getBean("wipro");
	comp2.work();
}
}
