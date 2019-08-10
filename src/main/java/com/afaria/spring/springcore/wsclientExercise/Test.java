package com.afaria.spring.springcore.wsclientExercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/springcore/wsclientExercise/config.xml");
		WsClient obj = (WsClient) context.getBean("wsc");

	}
}
