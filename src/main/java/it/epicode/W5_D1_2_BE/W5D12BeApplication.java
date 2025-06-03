package it.epicode.W5_D1_2_BE;

import it.epicode.W5_D1_2_BE.configuration.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class W5D12BeApplication {

	public static void main(String[] args) {

		SpringApplication.run(W5D12BeApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

	}

}
