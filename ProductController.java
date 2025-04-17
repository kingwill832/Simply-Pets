package com.SimplyPets.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    private ArrayList<Product> products;

    public ProductController() {
        this.products = new ArrayList<>();

        products.add(new Product(1, "Cat Department", "Cat Food", "$12.99", 50));
        products.add(new Product(2, "Cat Department", "Cat Bed", "$18.99", 50));
        products.add(new Product(3, "Cat Department", "Cat Toys", "$10.99", 50));
        products.add(new Product(5, "Dog Department", "Dog Cage", "$46.99", 100));
        products.add(new Product(6, "Dog Department", "Dog Food", "$24.99", 50));
        products.add(new Product(7, "Dog Department", "Dog Toys", "$18.99", 50));
        products.add(new Product(8, "Exotic Department", "Food", "$17.99", 50));
        products.add(new Product(9, "Exotic Department", "Bed", "$12.99", 50));
        products.add(new Product(10, "Exotic Department", "Toys", "$8.99", 50));
    }

    @GetMapping("/products")
    public List<Product> all() {
        return products;
    }

    @PostMapping("/products")
    public Product newProduct(@RequestBody Product newProduct) {
        products.add(newProduct);
        return newProduct;
    }
}
