package com.example.multimodule.application;

import com.example.multimodule.entity.Customer;
import com.example.multimodule.repository.MongoCustomerRepository;
import com.example.multimodule.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
@EnableMongoRepositories("com.example.multimodule")
public class DemoApplication  implements CommandLineRunner {

	@Autowired
	private MongoCustomerRepository repository;
	private final MyService myService;

	public DemoApplication(MyService myService, MongoCustomerRepository repository) {
		this.myService = myService;
		this.repository = repository;
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

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		repository.save(new Customer("111111111", "first", "last"));
		//Customer customer = repository.findById("63593b049fd71543329f5c96").get();
		//customer.setCrn("2222222");
		//repository.save(customer);

		/*// save a couple of customers
		//repository.save(new CustomerMongo("Alice", "Smith"));
		//repository.save(new CustomerMongo("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		//for (CustomerMongo customer : repository.findAll()) {
		//	System.out.println(customer);
		//}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		//System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		//for (CustomerMongo customer : repository.findByLastName("Smith")) {
		//	System.out.println(customer);
		//}*/
	}
}
