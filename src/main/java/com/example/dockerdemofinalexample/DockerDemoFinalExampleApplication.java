package com.example.dockerdemofinalexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoFinalExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoFinalExampleApplication.class, args);
	}
	
	@GetMapping(path = "/welcome")
	public String getMessage() {
		return "Final Example";
	}

}
