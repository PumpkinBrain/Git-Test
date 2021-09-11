package calculator;
import java.util.Scanner;

class Input {
	private static final Scanner sc = new Scanner(System.in);
	
	protected static int nextInt(String text) {
		System.out.println(text);
		return sc.nextInt();
	}
	
	protected static char nextChar(String text) {
		System.out.println(text);
		return sc.next().trim().charAt(0);
	}
}