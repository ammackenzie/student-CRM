package com.example.multimodule.application;

import com.example.multimodule.entity.Customer;
import com.example.multimodule.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
@RestController
public class DemoApplication {

	private final MyService myService;

	public DemoApplication(MyService myService) {
		this.myService = myService;
	}

	/*@GetMapping("/")
	public String home() {
		Customer customer = new Customer("1111111111", "first", "last", ZonedDateTime.now());
		return customer.toString();
				//myService.message();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
