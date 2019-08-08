package com.afaria.spring.springcore.reftypes;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/springcore/reftypes/listconfig.xml");

		Student student = (Student) context.getBean("student");
		System.out.println(student.toString());

	}

}
