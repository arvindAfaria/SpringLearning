package com.afaria.spring.springcore.inner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/springcore/inner/config.xml");
		Employee presc = (Employee) context.getBean("emp");
		System.out.println(presc);
	}
}
