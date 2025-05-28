package c_exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class G_AbaixoMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i];
        }
        double media = sum / vetor.length;

        System.out.printf("\nMédia do Vetor = %.3f\n", media);

        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }

        sc.close();
		
	}

}
