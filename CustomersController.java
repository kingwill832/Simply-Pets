package com.SimplyPets.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CustomersController {

   // @RequestMapping("/")
   // public String home() {
     //   return "Welcome to Simply Pets!";
    //}

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        Customers customers = new Customers();
        return customers.getCustomers();
    }
}

