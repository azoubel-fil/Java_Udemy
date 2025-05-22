package d_outros_topicos;

public class E_Bitwise {

	public static void main(String[] args) {

		int a = 5;   				// em binário: 0101
        int b = 3;   				// em binário: 0011

        int and = a & b;   			// AND bit a bit
    int or = a | b;    				// OR bit a bit
        int xor = a ^ b;   			// XOR bit a bit
        int notA = ~a;     			// NOT bit a bit (inversão de bits)
        int leftShift = a << 1; 	// desloca os bits de 'a' para a esquerda
        int rightShift = a >> 1;	// desloca os bits de 'a' para a direita

        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");
        System.out.println("a & b = " + and + " (" + Integer.toBinaryString(and) + ")");
        System.out.println("a | b = " + or + " (" + Integer.toBinaryString(or) + ")");
        System.out.println("a ^ b = " + xor + " (" + Integer.toBinaryString(xor) + ")");
        System.out.println("~a = " + notA + " (" + Integer.toBinaryString(notA) + ")");
        System.out.println("a << 1 = " + leftShift + " (" + Integer.toBinaryString(leftShift) + ")");
        System.out.println("a >> 1 = " + rightShift + " (" + Integer.toBinaryString(rightShift) + ")");
		
	}

}
