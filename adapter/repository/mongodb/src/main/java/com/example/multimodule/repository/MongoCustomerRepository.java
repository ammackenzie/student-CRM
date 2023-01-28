package com.example.multimodule.repository;

import com.example.multimodule.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MongoCustomerRepository extends MongoRepository<Customer, String> {

    public List<Customer> findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

    public Optional<Customer> findByCrn(String crn);

    public List<Customer> findAllByCrn(String crn);


}