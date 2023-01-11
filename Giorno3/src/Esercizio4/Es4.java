package Esercizio4;

import java.util.Scanner;

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int numero = myObj.nextInt();

		System.out.print("Countdown: ");

		for (int i = numero; i >= 0; i--) {

			System.out.print(i + " ");
		}
		myObj.close();
	}

}
