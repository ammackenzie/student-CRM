package com.example.multimodule.entity;

import org.springframework.data.annotation.Id;

import java.time.ZonedDateTime;

public class Customer {
    @Id
    private String id;
    private String crn;
    private String firstName;
    private String lastName;
    private ZonedDateTime lastUpdatedDate;
    private ZonedDateTime createdDate;

    public Customer() {}

    public Customer(String id, String crn, String firstName, String lastName, ZonedDateTime createdDate, ZonedDateTime lastUpdatedDate) {
        this.id = id;
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }
    public Customer(String crn, String firstName, String lastName, ZonedDateTime createdDate, ZonedDateTime lastUpdatedDate) {
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }


    public Customer(String crn, String firstName, String lastName) {
        this.crn = crn;
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
        return "Customer{" +
                "crn='" + crn + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
