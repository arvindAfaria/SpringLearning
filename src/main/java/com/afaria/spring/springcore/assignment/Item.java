package com.afaria.spring.springcore.assignment;

public class Item {

	private int id;
	private String name;
	private Double price;
	private int quant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quant=" + quant + "]";
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

}
