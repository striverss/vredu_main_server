package com.vredu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VreduMainServerApplication {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
		SpringApplication.run(VreduMainServerApplication.class, args);
	}

}
