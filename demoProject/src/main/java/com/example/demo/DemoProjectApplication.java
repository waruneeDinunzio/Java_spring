package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoProjectApplication.class, args);
		
		Customer c1 = context.getBean(Customer.class);
		c1.show();
		
		Customer c2= context.getBean(Customer.class);
	     c2.show();
	     
	     
	    Customer c3= context.getBean(Customer.class);
	     c3.show();
	}

}
