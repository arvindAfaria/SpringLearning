package com.afaria.spring.springcore.constructor.ambiguity;

public class Addition {

	
	Addition(Double a, Double b){
		System.out.println("inside double constructor");
		System.out.println(a);
		System.out.println(b);
	}
	
	Addition(int a, int b){
		System.out.println("inside int constructor");
	}
	
	
	Addition(String a, String b){
		System.out.println("inside String constructor");
	}
	
}
