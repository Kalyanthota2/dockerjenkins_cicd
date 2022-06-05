package com.practice.cicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicddemoApplication.class, args);
		System.out.println("+++++ Hi I am From CICD Demo Project +++++");
	}

}
