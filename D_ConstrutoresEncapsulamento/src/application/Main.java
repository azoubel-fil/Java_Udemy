package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nEnter product data: ");
		System.out.print("\nName: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("\nProduct data: " + product + "\n");
		
		System.out.print("Number of products to add: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product + "\n");
		
		System.out.print("Numer of products to remove: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product + "\n");
				
		sc.close();
		
	}

}
