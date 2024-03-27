package com.bobwares.prompts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.bobwares.prompts")
@EntityScan("com.bobwares.prompts.domain")
@SpringBootApplication
public class PromptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromptsApplication.class, args);
	}

}
