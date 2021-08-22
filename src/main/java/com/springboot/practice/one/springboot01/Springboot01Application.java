package com.springboot.practice.one.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Springboot01Application {

	public static void main(String[] args) {

		SpringApplication.run(Springboot01Application.class, args);
	}


}