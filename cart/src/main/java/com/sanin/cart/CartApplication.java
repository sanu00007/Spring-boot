package com.sanin.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CartApplication {

	public static void main(String[] args) {
		//System.out.print("hello sanin");
		ApplicationContext context =  SpringApplication.run(CartApplication.class, args);
		var order = context.getBean(OrderService.class);
		order.payprocess();
		//instead of this, we can use bean of ioc of spring
		// var order = new OrderService(new paypal());
		// order.payprocess();
	}

}
 