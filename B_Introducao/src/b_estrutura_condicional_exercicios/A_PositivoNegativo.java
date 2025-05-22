package b_estrutura_condicional_exercicios;

import java.util.Scanner;

public class A_PositivoNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println();
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
		}
		
		sc.close();
		
	}

}
