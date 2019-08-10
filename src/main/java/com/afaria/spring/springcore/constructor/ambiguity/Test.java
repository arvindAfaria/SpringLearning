package com.afaria.spring.springcore.constructor.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/springcore/constructor/ambiguity/config.xml");
		Addition obj = (Addition) context.getBean("addition");
		
	}
}
