package d_outros_topicos;

public class A_String {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG      ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(3, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original >" + original + "<");
		System.out.println("toLowerCase >" + s01 + "<");
		System.out.println("toUpperCase >" + s02 + "<");
		System.out.println("trim >" + s03 + "<");
		System.out.println("substring(2) >" + s04 + "<");
		System.out.println("substring(3,9) >" + s05 + "<");
		System.out.println("replace('a', 'x') >" + s06 + "<");
		System.out.println("replace('abc', 'xyz') >" + s07 + "<");
		System.out.println("index of('bc'): " + i);
		System.out.println("last index of('bc'): " + j);
		
	}

}
