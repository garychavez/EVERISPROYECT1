package com.everis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EverisProyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EverisProyectApplication.class, args);	
		
	}
	
}
