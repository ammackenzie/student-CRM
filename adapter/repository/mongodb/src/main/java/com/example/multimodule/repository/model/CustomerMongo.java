package com.example.multimodule.repository.model;

import com.example.multimodule.entity.Customer;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.Optional;

public class CustomerMongo {
    @Id
    private String id;
    private String crn;
    private String firstName;
    private String lastName;
    private Date lastUpdatedDate;
    private Date createdDate;

    private Date courseStartDate;
    private Date courseEndDate;

    public CustomerMongo() {}

    public static CustomerMongo from(Customer customer) {
        //TO DO = ID
        CustomerMongo customerDb = new CustomerMongo();
        Optional.ofNullable(customer.getId()).ifPresent(id->customerDb.setId(String.valueOf(new ObjectId(id))));
        customerDb.setFirstName(customer.getFirstName());
        customerDb.setLastName(customer.getLastName());
        customerDb.setCrn(customer.getCrn());
        customerDb.setCourseStartDate(customer.getCourseStartDate());
        customerDb.setCourseEndDate(customer.getCourseEndDate());
        customerDb.setCreatedDate(customer.getCreatedDate());
        customerDb.setLastUpdatedDate(customer.getCreatedDate());
        return customerDb;
    }

    public CustomerMongo(String id, String crn, String firstName, String lastName, Date lastUpdatedDate, Date createdDate) {
        this.id = id;
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdatedDate = lastUpdatedDate;
        this.createdDate = createdDate;
    }


    public CustomerMongo(String crn, String firstName, String lastName, Date lastUpdatedDate, Date createdDate) {
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdatedDate = lastUpdatedDate;
        this.createdDate = createdDate;
    }

    public CustomerMongo(String id, String crn, String firstName, String lastName, Date lastUpdatedDate, Date createdDate, Date courseStartDate, Date courseEndDate) {
        this.id = id;
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdatedDate = lastUpdatedDate;
        this.createdDate = createdDate;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
    }

    public CustomerMongo(String crn, String firstName, String lastName) {
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public Date getCourseEndDate() {
        return courseEndDate;
    }

    public void setCourseEndDate(Date courseEndDate) {
        this.courseEndDate = courseEndDate;
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
