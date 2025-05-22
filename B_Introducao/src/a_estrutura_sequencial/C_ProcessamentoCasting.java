package a_estrutura_sequencial;

public class C_ProcessamentoCasting {

	public static void main(String[] args) {

		// Atribuindo valores
		int x, y;

		x = 5;
		y = 2 * x;

		System.out.println(x);
		System.out.println(y);
		
		// Calculando área de um trapézio
		double baseMaior = 8.0;
		double baseMenor = 6.0;
		double altura = 5.0;

		double area = (baseMenor + baseMaior) / 2.0 * altura;

		System.out.println(area);
		
		// * * * CASTING * * * 
		int n1, n2;
		double resultado;
		
		n1 = 5;
		n2 = 2;
		
		resultado = (double) n1 / n2; // casting - conversão explícita
		
		System.out.println(resultado);
		
		// Casting também é necessário se o Java achar que você está perdendo informação
		double c;
		int d;
		
		c = 5.0;
		d = (int) c;
		
		System.out.println(d);
		
	}

}
