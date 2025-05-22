package a_estrutura_sequencial;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine(); // Lê uma linha inteira de texto, incluindo espaços.

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();    // Lê um número inteiro.

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble(); // Lê um número decimal (ponto flutuante).

        scanner.nextLine(); // Consome a quebra de linha pendente após nextInt() e nextDouble().

        System.out.print("Digite sua cor favorita: ");
        String corFavorita = scanner.nextLine(); // Lê outra linha inteira de texto.

        System.out.println("\nInformações digitadas:");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Cor Favorita: " + corFavorita);

        scanner.close(); // Fecha o Scanner para liberar recursos
	}

}
