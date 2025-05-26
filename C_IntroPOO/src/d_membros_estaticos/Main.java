package d_membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("\nCircumference: %.2f\n", c);
		System.out.printf("Volume: %.2f", v);
		System.out.printf("\nPI: %.2f\n", Calculator.PI);
		
		sc.close();
		
	}

}
