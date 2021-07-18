package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Invoice {
	Product product;
	Customer customer;
	@Autowired
	public Invoice(Product product,Customer customer) {
		super();
		this.product=product;
		this.customer=customer;
		
	}

}
