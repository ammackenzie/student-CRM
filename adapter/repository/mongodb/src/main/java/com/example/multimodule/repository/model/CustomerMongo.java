package com.example.multimodule.repository.model;

import org.springframework.data.annotation.Id;

import java.time.ZonedDateTime;

public class CustomerMongo {
    @Id
    private String id;
    private String crn;
    private String firstName;
    private String lastName;
    private ZonedDateTime createdDate;

    public CustomerMongo() {}

    public CustomerMongo(String id, String crn, String firstName, String lastName, ZonedDateTime createdDate) {
        this.id = id;
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdDate = createdDate;
    }

    public CustomerMongo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
