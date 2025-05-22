package b_estrutura_condicional_exercicios;

import java.util.Scanner;

public class D_TempoJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nDigite a hora do início do jogo: ");
		int horaInicial = sc.nextInt();
		System.out.print("Digite a hora do final do jogo: ");
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("\nO JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
		
	}

}
