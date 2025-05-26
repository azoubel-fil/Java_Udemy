package a_triangulo_sem_oo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.print("\nDigite as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.print("\nDigite as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - xA) * (p - yB) * (p - yC));
		
		System.out.printf("\nÁrea do Triângulo X: %.4f\n", areaX);
		System.out.printf("Área do Triângulo Y: %.4f\n", areaY);
		
		if (areaX > areaY) {
			System.out.println("\nTriângulo X é maior!");
		} else {
			System.out.println("\nTriângulo Y é maior!");
		}
		
		sc.close();
	}

}
