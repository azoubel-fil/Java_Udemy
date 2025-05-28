package c_exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class J_MediaAprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] grade1 = new double[n];
        double[] grade2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            sc.nextLine(); // Consume the pending newline

            names[i] = sc.nextLine();
            grade1[i] = sc.nextDouble();
            grade2[i] = sc.nextDouble();
        }

        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < n; i++) {
            double average = (grade1[i] + grade2[i]) / 2.0;
            if (average >= 6.0) {
                System.out.println(names[i]);
            }
        }

        sc.close();
		
	}

}
