package com.t7s.opencode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenCodeApplication.class, args);
	}

}
