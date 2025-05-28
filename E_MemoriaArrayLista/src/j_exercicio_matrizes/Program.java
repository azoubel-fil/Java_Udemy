package j_exercicio_matrizes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas (M): ");
        int m = sc.nextInt();
        System.out.print("Digite o número de colunas (N): ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite um número inteiro X que pertence à matriz: ");
        int x = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");

                    // Esquerda
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    // Acima
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    // Direita
                    if (j < n - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    // Abaixo
                    if (i < m - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
		
	}

}
