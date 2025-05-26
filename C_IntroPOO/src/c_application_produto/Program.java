package c_application_produto;

import java.util.Locale;
import java.util.Scanner;

import c_entities_produto.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("\nEnter product data: ");
		System.out.print("\nName: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("\nProduct data: " + product + "\n");
		
		System.out.print("Number of products to add: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product + "\n");
		
		System.out.print("Numer of products to remove: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product + "\n");
		
		sc.close();
		
	}

}
