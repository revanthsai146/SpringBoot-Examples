package com.example.runners;

import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {
private static final Logger logger=Logger.getLogger(CommandLineRunner.class.getName());
	@Override
	public void run(String... args) throws Exception {
		System.out.println("In CommandLine Runner Method component");
		logger.warning("=========Sample Warning==========");

		List<String> studentnames=List.of("Revanth","Sai","sidda");
		List<Integer> marks=List.of(100,99,100);
		List<String> department=List.of("CSE","ECE","IT");
	    logger.info("============Student name==========");
		for(String obj:studentnames) {
			System.out.print(obj+"\t");
		}
		System.out.println();
		 logger.info("============Department==========");
		for(String obj:department) {
			System.out.print(obj+"\t");
		}
		System.out.println();
		 logger.info("============Marks==========");
		for(Integer obj:marks) {
			System.out.print(obj+"\t");
		}
		System.out.println();
		
	}

}
