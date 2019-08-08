package com.afaria.spring.springcore.assignment;

public class ShoppingCart {

	private Item items;

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}

	public Item getItems() {
		return items;
	}

	public void setItems(Item items) {
		this.items = items;
	}
}
