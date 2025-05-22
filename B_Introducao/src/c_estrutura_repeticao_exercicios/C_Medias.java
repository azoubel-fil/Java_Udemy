package c_estrutura_repeticao_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class C_Medias {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("\nDigite o número de médias: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite as notas (uma linha): ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("Média: %.1f%n", media);
		}
		
		sc.close();
		
	}

}
