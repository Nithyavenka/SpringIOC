package com.nt;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public Test() {
	}

	public static void main(String[] args) {
		// ApplicationContext ctx = new
		// FileSystemXmlApplicationContext("src/main/resources/app.xml");
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("app.xml"));
		Address a = (Address) factory.getBean("adr");
		System.out.println("Finish");
	}

}
