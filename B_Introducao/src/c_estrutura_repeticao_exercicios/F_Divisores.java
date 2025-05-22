package c_estrutura_repeticao_exercicios;

import java.util.Scanner;

public class F_Divisores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nDigite um número: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

}
