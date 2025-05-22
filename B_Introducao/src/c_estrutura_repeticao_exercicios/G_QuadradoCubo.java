package c_estrutura_repeticao_exercicios;

import java.util.Scanner;

public class G_QuadradoCubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("Número: %d | Quadrado: %d | Cubo: %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
		
	}

}
