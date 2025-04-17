package com.SimplyPets.springboot;


public class Product {
    private int productId;
    private String department;
    private String productName;
    private String productPrice;
    private int available;

    public Product() {
    }

    public Product(int productId, String department, String productName, String productPrice, int available) {
        this.productId = productId;
        this.department = department;
        this.productName = productName;
        this.productPrice = productPrice;
        this.setAvailable(available);
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
    }

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}
    }
