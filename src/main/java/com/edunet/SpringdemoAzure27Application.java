package com.edunet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringdemoAzure27Application {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Your App Deployed sucessfully in Azure My dear Bharathi!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoAzure27Application.class, args);
	}

}
