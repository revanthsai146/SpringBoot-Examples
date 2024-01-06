package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		MyConfiguration config=new MyConfiguration();
		System.out.println(config.MyMethod());
		System.out.println("Main Method");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLine Run Method of Springboot class");
		// TODO Auto-generated method stub

	}

}
