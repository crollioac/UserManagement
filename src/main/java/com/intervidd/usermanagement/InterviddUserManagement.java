package com.intervidd.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class InterviddUserManagement {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(InterviddUserManagement.class, args);
	}
}
