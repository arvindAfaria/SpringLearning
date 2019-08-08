package com.afaria.spring.springcore.assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/springcore/assignment/listconfig.xml");
		ShoppingCart hospital = (ShoppingCart) context.getBean("shop");
		System.out.println("Total cost for " + hospital.getItems().getQuant() + " " + hospital.getItems().getName()
				+ " is " + hospital.getItems().getPrice() * hospital.getItems().getQuant());
	}

}
