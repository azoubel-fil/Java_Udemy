package c_exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class E_MaiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] numbers = new double[n];

		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			numbers[i] = sc.nextDouble();
		}

		double largestNumber = numbers[0];
		int largestPosition = 0;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largestNumber) {
				largestNumber = numbers[i];
				largestPosition = i;
			}
		}

		System.out.println();

		System.out.printf("Maior valor = %.2f\n", largestNumber);
		System.out.printf("Posição do maior valor = %d\n", largestPosition);

		sc.close();
		
	}

}
