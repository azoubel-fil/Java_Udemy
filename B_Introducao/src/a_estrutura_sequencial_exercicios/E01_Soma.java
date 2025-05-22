package a_estrutura_sequencial_exercicios;

import java.util.Scanner;

public class E01_Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int v1, v2, soma;
		
		System.out.println("* * * * SOMA * * * *\n");
		
		System.out.print("Digite o primeiro número: ");
		v1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		v2 = sc.nextInt();
		
		soma = v1 + v2;
		
		System.out.printf("\n%d + %d = %d\n", v1, v2, soma);
		
		sc.close();
		
	}

}
