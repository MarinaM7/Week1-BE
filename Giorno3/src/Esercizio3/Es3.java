package Esercizio3;

import java.util.Scanner;

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = myObj.nextLine();
		
		myObj.close();
		
		String esc = ":q";
		int i = 0;
		
		while(!string.equals(esc) && i<string.length()) {
			System.out.print(string.charAt(i) + ", ");
            i++;
        }
	}
//		
//		Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("Inserisci una stringa (per interrompere scrivi ':q'): ");
//            String input = scanner.nextLine();
//            if (input.equals(":q")) {
//            	System.out.print("Esercizio chiuso");
//                break;
//            }
//            for (int i = 0; i < input.length(); i++) {
//                System.out.print(input.charAt(i));
//                if (i < input.length() - 1) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.println();
//        }
//        scanner.close();
	}
