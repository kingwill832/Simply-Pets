package com.SimplyPets.springboot;


//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

//@Entity // Optional if using JPA
public class Customer {

 // @Id // Primary key if you're using a database
 private int customerId;
 private String customerName;
 private String customerAddress;

 // Default constructor
 public Customer() {
 }

 // Parameterized constructor
 public Customer(int customerId, String customerName, String customerAddress) {
     this.customerId = customerId;
     this.customerName = customerName;
     this.customerAddress = customerAddress;
 }

 // Getters and Setters
 public int getCustomerId() {
     return customerId;
 }

 public void setCustomerId(int customerId) {
     this.customerId = customerId;
 }

 public String getCustomerName() {
     return customerName;
 }

 public void setCustomerName(String customerName) {
     this.customerName = customerName;
 }

 public String getCustomerAddress() {
     return customerAddress;
 }

 public void setCustomerAddress(String customerAddress) {
     this.customerAddress = customerAddress;
 }

 // Optional toString() method
 @Override
 public String toString() {
     return "Customer{" +
             "id=" + customerId +
             ", name='" + customerName + '\'' +
             ", address='" + customerAddress + '\'' +
             '}';
 }
}
