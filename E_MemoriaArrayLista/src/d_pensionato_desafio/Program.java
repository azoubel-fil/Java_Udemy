package d_pensionato_desafio;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.print("Quantos estudantes vao alugar quartos? (1-10): ");
        int n = sc.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Numero de estudantes invalido. Por favor, digite um valor entre 1 e 10.");
            sc.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf("\nAluguel #%d:\n", i);
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto escolhido (0-9): ");
            int roomNumber = sc.nextInt();

            if (roomNumber < 0 || roomNumber > 9) {
                System.out.println("Numero de quarto invalido. Por favor, escolha um quarto entre 0 e 9.");
                i--;
                continue;
            }

            if (rooms[roomNumber] != null) {
                System.out.println("Quarto " + roomNumber + " ja esta ocupado. Por favor, escolha outro.");
                i--;
                continue;
            }

            rooms[roomNumber] = new Rent(name, email);
        }

        System.out.println("\nQuartos ocupados:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
		
	}

}
