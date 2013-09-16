package com.sudheer.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {

	@Value("#{'sudheer'.toUpperCase()}")
	private String name;

	@Value("#{priceBean.getSpecialPrice()}")
	private double amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", amount=" + amount + "]";
	}

}