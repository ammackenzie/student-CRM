package com.example.multimodule.repository.model;

import com.example.multimodule.entity.Customer;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.ZonedDateTime;
import java.util.Optional;

public class CustomerMongo {
    @Id
    private String id;
    private String crn;
    private String firstName;
    private String lastName;
    private ZonedDateTime lastUpdatedDate;
    private ZonedDateTime createdDate;

    public CustomerMongo() {}

    public static CustomerMongo from(Customer customer) {
        //TO DO = ID
        CustomerMongo customerDb = new CustomerMongo();
        Optional.ofNullable(customer.getId()).ifPresent(id->customerDb.setId(String.valueOf(new ObjectId(id))));
        customerDb.setFirstName(customer.getFirstName());
        customerDb.setLastName(customer.getLastName());
        customerDb.setCrn(customer.getCrn());
        customerDb.setCreatedDate(customer.getCreatedDate());
        return customerDb;
    }

    public CustomerMongo(String id, String crn, String firstName, String lastName, ZonedDateTime lastUpdatedDate, ZonedDateTime createdDate) {
        this.id = id;
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdatedDate = lastUpdatedDate;
        this.createdDate = createdDate;
    }


    public CustomerMongo(String crn, String firstName, String lastName, ZonedDateTime lastUpdatedDate, ZonedDateTime createdDate) {
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdatedDate = lastUpdatedDate;
        this.createdDate = createdDate;
    }



    public CustomerMongo(String crn, String firstName, String lastName) {
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdatedDate = lastUpdatedDate;
        this.createdDate = createdDate;
    }

    public CustomerMongo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ZonedDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(ZonedDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "CustomerMongo{" +
                "id='" + id + '\'' +
                ", crn='" + crn + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
