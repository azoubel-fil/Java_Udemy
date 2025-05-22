package b_estrutura_condicional_exercicios;

import java.util.Scanner;

public class C_SaoMultiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int valorA, valorB;
		
		System.out.println();
		System.out.print("Digite o valor A: ");
		valorA = sc.nextInt();
		System.out.print("Digite o valor B: ");
		valorB = sc.nextInt();
		
		if (valorA > valorB) {
			if (valorA % valorB == 0) {
				System.out.println("\nSão múltiplos.");
			} else {
				System.out.println("\nNão são múltiplos.");
			}
		} else if (valorA < valorB) {
			if (valorB % valorA == 0) {
				System.out.println("\nSão múltiplos.");
			} else {
				System.out.println("\nNão são múltiplos.");
			}
		} else {
			System.out.println("\nNúmeros iguais.");
		}
		
		sc.close();	
		
	}

}
