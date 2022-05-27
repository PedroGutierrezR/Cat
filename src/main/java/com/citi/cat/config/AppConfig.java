package com.citi.cat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.citi.cat.app.*")
public class AppConfig {

	@Bean
	public RestTemplate returnRestTemplate() {
		return new RestTemplate();
	}

}
