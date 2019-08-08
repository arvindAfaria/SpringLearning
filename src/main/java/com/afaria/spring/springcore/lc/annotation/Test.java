package com.afaria.spring.springcore.lc.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/springcore/lc/annotation/config.xml");
		Patient hospital = (Patient) context.getBean("patient");
		System.out.println(hospital);
		context.registerShutdownHook();
		context.close();
	}
}
