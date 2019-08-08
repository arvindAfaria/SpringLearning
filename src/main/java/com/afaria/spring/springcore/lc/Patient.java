package com.afaria.spring.springcore.lc;

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
	
	public void init() {
		System.out.println("initilized");
	}
	
	public void destry() {
		System.out.println("Destryoed");
	}
}
