package a_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nDigite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite uma altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("\nMédia das alturas: %.2f", avg);
		
		sc.close();
		
	}

}
