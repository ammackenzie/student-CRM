package com.example.multimodule.application.usecase;

import com.example.multimodule.entity.Customer;
import com.example.multimodule.repository.MongoCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
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
            throw new RuntimeException("Record for customer CRN already exists");
        }else{
            saved = this.repository.save(createCustomerConverter(customer));
        }
        return saved;
    }

    public Customer updateCustomer(Customer customer) {
        Optional<Customer> customerDb = this.repository.findByCrn(customer.getCrn());
        Customer saved;
        if(customerDb.isPresent()){
            customerDb.get().setFirstName(customer.getFirstName());
            customerDb.get().setLastName(customer.getLastName());
            saved = this.repository.save(updateCustomerConverter(customerDb.get()));
        }else{
           throw new RuntimeException("Customer can't be found by CRN");
        }
        return saved;
    }

    public Customer findByCrn(String crn){
       Optional<Customer> customerDb =  this.repository.findByCrn(crn);
       return customerDb.isPresent() ? customerDb.get() : null;
    }

    public Customer findById(String id){
        Optional<Customer> customerDb =  this.repository.findById(id);
        return customerDb.isPresent() ? customerDb.get() : null;
    }

    public List<Customer> findAllByCrn(String crn){
        List<Customer> customerDb =  this.repository.findByCrnContaining(crn);
        return customerDb;
    }


    public static Customer createCustomerConverter(Customer customer){
        customer.setCreatedDate(new Date());
        customer.setLastUpdatedDate(new Date());
        return customer;
    }

    public static Customer updateCustomerConverter(Customer customer){
        customer.setLastUpdatedDate(new Date());
        return customer;
    }


}
