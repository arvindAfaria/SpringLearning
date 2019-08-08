package com.afaria.spring.springcore.list;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/afaria/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println(hospital.getName());
//		String list1 = hospital.getDepartments().get(0);
		
		System.out.println(hospital.getDepartments());
	}

}
