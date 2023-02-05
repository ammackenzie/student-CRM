package com.example.multimodule.entity;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import static com.example.multimodule.entity.utils.UtilConstants.convertDateToInputFormat;

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
    private Date lastUpdatedDate;
    private Date createdDate;

    public Customer() {}

    public Customer(String crn) {
        this.crn = crn;
    }

    public Customer(String id, String crn, String firstName, String lastName, Date courseStartDate, Date courseEndDate, Date lastUpdatedDate, Date createdDate) {
        this.id = id;
        this.crn = crn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.createdDate = createdDate;
    }

    public Customer(String crn, String firstName, String lastName, Date courseStartDate, Date courseEndDate, Date lastUpdatedDate, Date createdDate) {
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

    public Date getCourseStartDateAsDate() { return null!=getCourseStartDate()?Date.from(getCourseStartDate().toInstant()):null; }

    public Date getCourseEndDateAsDate() { return null!=getCourseEndDate()?Date.from(getCourseEndDate().toInstant()):null; }

    public Date getCreatedDateAsDate() {
        return null!=getCreatedDate()?Date.from(getCreatedDate().toInstant()):null;
    }

    public Date getUpdatedDateAsDate() {
        return null!=getLastUpdatedDate()?Date.from(getLastUpdatedDate().toInstant()):null;
    }

    public String getCourseStartDateAsInputString(){
        return convertDateToInputFormat(getCourseStartDate());
    }

    public String getCourseEndDateAsInputString(){
        return convertDateToInputFormat(getCourseEndDate());
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
