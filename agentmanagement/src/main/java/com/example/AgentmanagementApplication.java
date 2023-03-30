package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgentmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgentmanagementApplication.class, args);
		System.out.println("Thread :"+Thread.currentThread().getName());
	}

}
