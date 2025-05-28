package c_exercicios_vetor;

import java.util.Scanner;

public class A_Negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("\nDigite o tamanho do vetor: ");
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		System.out.println();
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("\nNúmeros negativos:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) { 
				System.out.println(vect[i]);
			}
		}		
		
		sc.close();	
	}

}
