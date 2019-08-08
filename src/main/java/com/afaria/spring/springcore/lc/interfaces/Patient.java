package com.afaria.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("somthing");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	

	public void hello() {
		System.out.println("initilized");
	}
	
	public void tata() {
		System.out.println("Destryoed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("in after prop method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("new destry method");
		
	}
}
