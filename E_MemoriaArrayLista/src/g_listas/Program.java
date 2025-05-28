package g_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		list.add("John");
		
		System.out.println("\nTamanho da lista: " + list.size());
		
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("\n---------------------------------\n");
		list.remove("Alex");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("\n---------------------------------\n");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("\n---------------------------------\n");	
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
		System.out.println(x);
		}
		
		System.out.println("\n---------------------------------\n");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
