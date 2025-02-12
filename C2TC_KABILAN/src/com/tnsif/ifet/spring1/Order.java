package com.tnsif.ifet.spring1;
import java.util.*;

class Order {
	Customer customer;
    List<Product> products = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order for: " + customer.name);
        double total = 0;
        for (Product p : products) {
            System.out.println(p.name + " - $" + p.price);
            total += p.price;
        }
        System.out.println("Total: $" + total);
    }

}
