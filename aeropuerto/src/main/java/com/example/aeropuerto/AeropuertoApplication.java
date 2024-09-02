package com.example.aeropuerto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "model")
public class AeropuertoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AeropuertoApplication.class, args);
	}

}
