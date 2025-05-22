package a_estrutura_sequencial;

import java.util.Scanner;

public class D_EntradaDadosI {

	public static void main(String[] args) {
		// Cria o objeto de Scanner
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		System.out.print("Digite um nome: ");
		x = sc.next();
		System.out.println(x);
		
		
		int y;
		
		System.out.print("Digite um número inteiro: ");
		y = sc.nextInt();
		System.out.println(y);
		
		double z;
		
		// o double usa o Locale, usar vírgula ou joga exception
		System.out.print("Digite um número flutuante: ");
		z = sc.nextDouble();
		System.out.println(z);
		
		char a;
		
		System.out.print("Digite um caractere: ");
		a = sc.next().charAt(0);
		System.out.println(a);
		
		// Entrando vários dados na mesma linha (separa c/ espaço ou enter)
		String b;
		int c;
		double d;
		
		System.out.println("Digite uma string, um int e um double:");
		b = sc.next();
		c = sc.nextInt();
		d = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// Encerra o scanner
		sc.close();
	}

}
