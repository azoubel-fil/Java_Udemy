package c_estrutura_repeticao_exercicios;

import java.util.Scanner;

public class A_Impares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nDigite o valor de x: ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

}
