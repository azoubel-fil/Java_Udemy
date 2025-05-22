package a_estrutura_sequencial_exercicios;

import java.util.Scanner;

public class E06_Areas {

	public static void main(String[] args) {

		System.out.println("* * * * ÁREAS * * * *");
		
		double a, b, c;
		double areaTriangulo, areaCirculo; 
		double areaTrapezio, areaQuadrado, areaRetangulo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nDigite o valor de A: ");
		a = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = sc.nextDouble();
		
		areaTriangulo = (a * c) / 2;
		areaCirculo = 3.14159 * (c * c);
		// (b + B) * h / 2
		areaTrapezio = ((a + b) * c) / 2;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a * b;
		
		System.out.printf("\nTRIÂNGULO: %.3f", areaTriangulo);
		System.out.printf("\nCÍRCULO: %.3f", areaCirculo);
		System.out.printf("\nTRAPÉZIO: %.3f", areaTrapezio);
		System.out.printf("\nQUADRADO: %.3f", areaQuadrado);
		System.out.printf("\nRETÂNGULO: %.3f\n", areaRetangulo);
		
		sc.close();
		
	}

}
