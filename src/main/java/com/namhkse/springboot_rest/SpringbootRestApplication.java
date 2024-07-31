package com.namhkse.springboot_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.namhkse.springboot_rest.mapper") 
public class SpringbootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApplication.class, args);
	}

}
