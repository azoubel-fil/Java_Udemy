package c_estrutura_repeticao_exercicios;

import java.util.Scanner;

public class B_IntervaloInOut {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nDigite o total de números: ");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\nDigite %dº valor: ", i + 1);
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " \nIn");
		System.out.println(out + " Out");
		
		sc.close();
		
	}

}
