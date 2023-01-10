import java.util.Scanner;

public class Metodi {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println( a + b);
		
		printSum(10, -4, 10);
		
		/*
		helloStudent("Mario");
		helloStudent("Luigi");
		*/
		
		Scanner in = new Scanner(System.in);
		in.close();
	}
	
	static int sum(int a, int b) {
		return a * b;
	}
	
	static void printSum (int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	/*
	static void helloStudent () {
		System.out.println();
	}
	*/

}
