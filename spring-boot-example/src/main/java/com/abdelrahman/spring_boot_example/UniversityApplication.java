package com.abdelrahman.spring_boot_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversityApplication {
	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
		System.out.println("University System Application Running...");
	}
}
