package c_exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class I_MaisVelho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();

            System.out.print("Nome: ");
            names[i] = sc.nextLine();

            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
        }

        int oldestAge = ages[0];
        int oldestPersonIndex = 0;

        for (int i = 1; i < n; i++) {
            if (ages[i] > oldestAge) {
                oldestAge = ages[i];
                oldestPersonIndex = i;
            }
        }

        System.out.println("\nPESSOA MAIS VELHA: " + names[oldestPersonIndex]);

        sc.close();
		
	}

}
