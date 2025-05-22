package a_estrutura_sequencial_exercicios;

import java.util.Scanner;

public class E02_AreaCirculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio, area;
		
		System.out.println("* * * * CÍRCULO * * * *\n");
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pi * (raio * raio);
		
		System.out.printf("\n\nA área do círculo é: %.4f", area);
		
		sc.close();
		
	}

}
