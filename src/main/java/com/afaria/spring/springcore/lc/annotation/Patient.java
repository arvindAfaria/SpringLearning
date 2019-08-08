package com.afaria.spring.springcore.lc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

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

	@PostConstruct
	public void hello() {
		System.out.println("initilized");
	}

	@PreDestroy
	public void tata() {
		System.out.println("Destryoed");
	}
}
