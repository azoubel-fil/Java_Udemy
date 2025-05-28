package c_exercicios_vetor;

import java.util.Scanner;

public class D_NumerosPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nDigite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		int[] numeros = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("\nNúmeros Pares:");
		
		int quantidadePares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
				quantidadePares++;
			}
		}
		
		System.out.println("Quantidade de pares: " + quantidadePares);
		
		sc.close();
		
	}

}
