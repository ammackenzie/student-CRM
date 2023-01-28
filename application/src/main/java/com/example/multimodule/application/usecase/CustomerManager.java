package com.example.multimodule.application.usecase;

import com.example.multimodule.entity.Customer;
import com.example.multimodule.repository.MongoCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerManager {
    @Autowired
    private MongoCustomerRepository repository;

    public Customer createCustomer(Customer customer) {
        Optional<Customer> customerDb = this.repository.findByCrn(customer.getCrn());
        Customer saved;
        if(customerDb.isPresent()){
            customerDb.get().setFirstName(customer.getFirstName());
            customerDb.get().setLastName(customer.getLastName());
            saved = this.repository.save(customerDb.get());
        }else{
            saved = this.repository.save(customer);
        }
        return saved;
    }

    public Customer findByCrn(String crn){
       Optional<Customer> customerDb =  this.repository.findByCrn(crn);
       return customerDb.isPresent() ? customerDb.get() : null;
    }

    public List<Customer> findAllByCrn(String crn){
        List<Customer> customerDb =  this.repository.findAllByCrn(crn);
        return customerDb;
    }



}
