package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Invoice;
import com.example.demo.model.Product;

@SpringBootApplication
public class SpringQuickstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringQuickstartApplication.class, args);
	Product product1=ctx.getBean(Product.class);
	System.out.println(product1);
	Product product2=ctx.getBean(Product.class,"fridge");
	System.out.println(product2);
	Invoice inv=ctx.getBean(Invoice.class);
	System.out.println(inv);
}
	@Bean
	public Product tv(){
		return new Product(101,"tv",34000);
	}
	@Bean
	public Product fridge(){
		return new Product(101,"fridge",34000);
	}

}
