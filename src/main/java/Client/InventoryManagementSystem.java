package Client;

import Model.ProductRequest;
import Service.ProductService;

import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Inventory Management System");
            System.out.println("1.Add product");
            System.out.println("2.Display all products");
            System.out.println("3.Notify for low product stock");
            System.out.println("4.Add category");
            System.out.println("5.Display all categories");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Ju lutem fusni te dhenat e produktits");
                    createProduct(sc);
                    break;

            }
        } while (choice != 6) ;
            sc.close();
    }

    public static void createProduct(Scanner sc) {
        System.out.printf("Fusni emrin e produktit");
        String name = sc.next();

        System.out.printf("Fusni pershkrimin e produktit");
        String description = sc.next();

        System.out.printf("Fusni cmimin e produktit");
        Double price = sc.nextDouble();

        System.out.printf("Fusni sasine e produktit");
        Integer quantity = sc.nextInt();

        System.out.printf("Fusni categorine e produktit");
        Long catId = sc.nextLong();


        ProductRequest request = new ProductRequest();
        request.setTitle(name);
        request.setDescription(description);
        request.setPrice(price);
        request.setQuantity(quantity);
        request.setCatId(catId);

        ProductService productService = new ProductService();
        productService.createProduct(request);
    }
}
