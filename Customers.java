package com.SimplyPets.springboot;


import java.util.ArrayList;

public class Customers {

    private ArrayList<Customer> customers;

    public Customers() {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Tony Snow", "1000 Snow Street, Houston, TX, 77055"));
        customers.add(new Customer(2, "Bat Man", "5000 Kings Way, Gotham, NY, 77998"));
        customers.add(new Customer(3, "Bruce Wayne", "5000 Kings Way, Gotham, NY, 77998"));
        customers.add(new Customer(4, "Kim Kit", "645 Kit Lane, Dallas, TX, 77501"));
        customers.add(new Customer(5, "Dave Dommer", "8700 Kill Joy BLVD, Woodlands, TX, 77354"));
        customers.add(new Customer(6, "Mitch Wayne", "1200 Dirt Lane, El Paso, TX, 79835"));
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}


