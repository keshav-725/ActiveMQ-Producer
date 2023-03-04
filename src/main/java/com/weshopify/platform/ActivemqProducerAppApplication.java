package com.weshopify.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ActivemqProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqProducerAppApplication.class, args);
	}

}
