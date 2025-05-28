package c_exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class K_DadosPessoais {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            sc.nextLine();

            System.out.printf("Genero da %da pessoa (M/F): ", i + 1);
            generos[i] = sc.next().charAt(0);
        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];
        double somaAlturaMulheres = 0.0;
        int countMulheres = 0;
        int countHomens = 0;

        for (int i = 0; i < n; i++) {
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }

            if (generos[i] == 'F' || generos[i] == 'f') {
                somaAlturaMulheres += alturas[i];
                countMulheres++;
            } else if (generos[i] == 'M' || generos[i] == 'm') {
                countHomens++;
            }
        }

        System.out.printf("\nMenor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);

        if (countMulheres > 0) {
            double mediaAlturaMulheres = somaAlturaMulheres / countMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
        } else {
            System.out.println("Nao ha mulheres no grupo para calcular a media de altura.");
        }

        System.out.printf("Numero de homens = %d\n\n", countHomens);

        sc.close();
		
	}

}
