package com.example.multimodule.entity;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.ZonedDateTime;
import java.util.Date;

public class Customer {
    @Id
    private String id;
    private String crn;
    private String firstName;
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date courseStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date courseEndDate;
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

    public Customer(String id, String crn, String firstName, String lastName, Date courseStartDate, Date courseEndDate, ZonedDateTime lastUpdatedDate, ZonedDateTime createdDate) {
        this.id = id;
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.createdDate = createdDate;
    }

    public Customer(String crn, String firstName, String lastName, Date courseStartDate, Date courseEndDate, ZonedDateTime lastUpdatedDate, ZonedDateTime createdDate) {
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
        this.lastUpdatedDate = lastUpdatedDate;
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
