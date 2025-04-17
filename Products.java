package com.SimplyPets.springboot;


    public class Products {
    private int productId;
    private String productName;
    private String productPrice;
    private String productDepartment; 

    // Default constructor
    public Products() {
    }

    // Parameterized constructor
    public Products(int productId, String productName, String productPrice, String productDepartment) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDepartment = productDepartment;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDepartment() {
        return productDepartment;
    }

    public void setProductDepartment(String productDepartment) {
        this.productDepartment = productDepartment;
    }
}





