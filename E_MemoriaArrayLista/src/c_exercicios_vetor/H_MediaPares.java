package c_exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class H_MediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        int sumPares = 0;
        int countPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                sumPares += vetor[i];
                countPares++;
            }
        }

        System.out.println();

        if (countPares > 0) {
            double mediaPares = (double) sumPares / countPares;
            System.out.printf("Média dos pares = %.1f\n", mediaPares);
        } else {
            System.out.println("Nenhum número par.\n");
        }

        sc.close();
		
	}

}
