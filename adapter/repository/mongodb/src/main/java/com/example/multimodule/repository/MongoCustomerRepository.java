package com.example.multimodule.repository;

import com.example.multimodule.repository.model.CustomerMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoCustomerRepository extends MongoRepository<CustomerMongo, String> {

    public CustomerMongo findByFirstName(String firstName);
    public List<CustomerMongo> findByLastName(String lastName);
}
