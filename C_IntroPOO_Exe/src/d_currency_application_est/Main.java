package d_currency_application_est;

import java.util.Locale;
import java.util.Scanner;

import d_currency_entities_est.CurrencyConverter;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nDollar price: ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought: ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		
		System.out.printf("\nAmount to be paid in reais: R$ %.2f\n", result);
		
		sc.close();
		
	}

}
