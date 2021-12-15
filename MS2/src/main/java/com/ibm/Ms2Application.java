package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Ms2Application implements CommandLineRunner{
	@Autowired
	MyProperties myProperies;

	public static void main(String[] args) {
		SpringApplication.run(Ms2Application.class, args);
	}
	 @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	@Override
	public void run(String... args) throws Exception {
		System.out.println(myProperies.getMessage());
		System.out.println(myProperies.getUrl());
		
	}

}
