package c_estrutura_repeticao_exercicios;

import java.util.Scanner;

public class D_MediasB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nDigite o número de divisões: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Digite dois valores (mesma linha): ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("Resultado: %.1f%n", div);
			}
		}
		
		sc.close();
		
		
	}

}
