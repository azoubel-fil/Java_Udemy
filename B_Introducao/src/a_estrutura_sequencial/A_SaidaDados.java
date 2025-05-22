package a_estrutura_sequencial;

import java.util.Locale;

public class A_SaidaDados {

	public static void main(String[] args) {

		// Considerar separador de decimais como Ponto
		Locale.setDefault(Locale.US);
		
		// Sem quebra de linha ao final
		System.out.print("Bom dia!");

		// Com quebra de linha ao final
		System.out.println("Bom dia");
		
		// Escrevendo o conteúdo de uma variável de algum tipo básico
		int y = 32;
		System.out.println(y);
		
		// Escrever o conteúdo de uma variável com ponto flutuante
		double x = 10.35789;

		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		// Concatenando
		System.out.println("RESULTADO = " + x + " METROS");
		
		// Concatenando com o uso de printf
		System.out.printf("RESULTADO = %.2f metros\n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		System.out.printf("%s tem %d anos e ganha %.2f reais\n", nome, idade, renda);
		
	}

}
