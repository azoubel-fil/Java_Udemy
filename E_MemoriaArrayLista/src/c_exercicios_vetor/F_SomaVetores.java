package c_exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class F_SomaVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terão os vetores? ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("\nDigite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Elemento %d: ", i);
            vetorA[i] = sc.nextInt();
        }

        System.out.println("\nDigite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Elemento %d: ", i);
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("\nVETOR RESULTANTE (C):");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorC[i]);
        }

        sc.close();
		
	}

}
