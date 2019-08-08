package com.afaria.spring.springcore.lc.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/springcore/lc/interfaces/config.xml");
		Patient hospital = (Patient) context.getBean("patient");
		System.out.println(hospital);
		((AbstractApplicationContext) context).close();
	}
}
