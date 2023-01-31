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
            saved = this.repository.save(updateCustomerConverter(customerDb.get(), customer));
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
        customer.setLastUpdatedDate(customer.getLastUpdatedDate());
        return customer;
    }

    public static Customer updateCustomerConverter(Customer base, Customer working){
        base.setFirstName(working.getFirstName());
        base.setLastName(working.getLastName());
        base.setCourseStartDate(working.getCourseStartDate());
        base.setCourseEndDate(working.getCourseEndDate());
        base.setLastUpdatedDate(new Date());
        return base;
    }
}
