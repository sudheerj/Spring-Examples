package com.sudheer.core;

public class Item {

	private String name;

	private int qty;

	public Item(String name, int qty) {
		super();
		this.name = name;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", qty=" + qty + "]";
	}

}