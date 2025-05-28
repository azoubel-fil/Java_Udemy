package b_vetor_classe_program;

import java.util.Locale;
import java.util.Scanner;

import b_vetor_classe_entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double sum, avg;
		
		System.out.print("\nDigite o tamanho do vetor: ");
		n = sc.nextInt();
		
		System.out.println();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do produto: ");
			String name = sc.nextLine();
			System.out.print("Digite o preço: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price); 
		}
		
		sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		avg = sum / vect.length;
		
		System.out.printf("\nPreço médio: $ %.2f\n", avg);
		
		sc.close();
		
	}

}
