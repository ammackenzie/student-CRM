package com.example.multimodule.entity;

import java.time.ZonedDateTime;

public class Customer {
    private String crn;
    private String firstName;
    private String lastName;
    private ZonedDateTime createdDate;

    public Customer() {}

    public Customer(String crn, String firstName, String lastName, ZonedDateTime createdDate) {
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdDate = createdDate;
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
