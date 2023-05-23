package io.paketo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Value("${azure.spring.cloud.config-server.health:DOWN}")
	private String isHealth;

	@Value("${repo:UNKNOWN}")
	private String repo;

	@Value("${auth:UNKNOWN}")
	private String auth;

	@GetMapping("/config")
	public String getIsHealth() {
		return isHealth;
	}
	@GetMapping("/repo")
	public String getRepo() {
		return repo;
	}

	@GetMapping("/auth")
	public String getAuth() {
		return auth;
	}

	@GetMapping("/test")
	public String mytest() {
		return "test";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
