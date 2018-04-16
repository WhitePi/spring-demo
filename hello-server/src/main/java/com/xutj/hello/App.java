package com.xutj.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class App {

	@GetMapping("/")
	public String getHello() {
		return "hello world !";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
