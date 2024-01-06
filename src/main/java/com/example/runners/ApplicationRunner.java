package com.example.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("In ApplicationRunner Method");
	
	}

}
