package com.tnsif.ifet.spring1;
import java.util.*;

public class ShoppingMallManagement {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Shirt", 25.5));
        productList.add(new Product(2, "Jeans", 40.0));
        productList.add(new Product(3, "Shoes", 60.0));

        System.out.print("Enter Customer ID: ");
        int custId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Customer Name: ");
        String custName = scanner.nextLine();
        Customer customer = new Customer(custId, custName);
        Order order = new Order(customer);

        System.out.println("Available Products:");
        for (Product p : productList) {
            System.out.println(p.id + ". " + p.name + " - $" + p.price);
        }

        System.out.println("Enter product IDs to order (0 to finish):");
        while (true) {
            int productId = scanner.nextInt();
            if (productId == 0) break;
            for (Product p : productList) {
                if (p.id == productId) {
                    order.addProduct(p);
                    break;
                }
            }
        }

        order.displayOrder();
        scanner.close();
    }
}

}
