package c_exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class C_Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.print("\nDigite o tamanho do vetor: ");
		n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %d pessoa\n", i + 1);
			sc.nextLine();		// Consome quebra de linha do nextInt
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Person(nome, idade, altura);			
		}
		
		System.out.println();
		
		double totalHeight = 0.0;
		for (int i = 0; i < vect.length; i++) {
			totalHeight += vect[i].getAltura();
		}
		
		double avgHeight = totalHeight / vect.length;
		System.out.printf("Altura média: %.2f\n", avgHeight);
		
		int underCount = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				underCount++;
			}
		}
		
		double percentageMinors = (double) underCount / vect.length * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentageMinors);
        
        if (underCount > 0) {
            System.out.println("Nomes das pessoas com menos de 16 anos:");
            for (int i = 0; i < vect.length; i++) {
                if (vect[i].getIdade() < 16) {
                    System.out.println(vect[i].getNome());
                }
            }
        } else {
            System.out.println("Não há pessoas com menos de 16 anos.");
        }
		
		sc.close();
	}

}
