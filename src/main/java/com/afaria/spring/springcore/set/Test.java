package com.afaria.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/springcore/set/setconfig.xml");

		System.out.println(((CarDealer) context.getBean("dealer")).toString());
	}

}
