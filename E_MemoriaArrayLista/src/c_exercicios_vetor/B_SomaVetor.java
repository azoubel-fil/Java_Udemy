package c_exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class B_SomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nDigite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		System.out.print("\nValores: ");
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);			
		}
		
		System.out.printf("\nSoma: %.2f", sum);
		System.out.printf("\nMédia: %.2f\n", avg);
		
		sc.close();
		
	}

}
