package org.parkerInc.springApp;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test {
public static void main(String[] args) {
Resource res=new ClassPathResource("Spring.xml");
BeanFactory bef=new XmlBeanFactory(res);
Demo demo =(Demo)bef.getBean("first");
demo.display();
}
}
