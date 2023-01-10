package es1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);

		System.out.println("******+++++ Rettangolo 1 +++++******");
		System.out.println("Inserisci un valore per la base 1:");
		double base1 = myObj.nextDouble();
		System.out.println("Inserisci un valore per l'altezza 1:");
		double altezza1 = myObj.nextDouble();
		Rettangolo r1 = new Rettangolo(base1, altezza1);
		System.out.println("Perimetro rettangolo 1: " + r1.Perimetro());
		System.out.println("Area rettangolo 1: " + r1.Area());
		
		System.out.println("\n ******+++++ Rettangolo 2 +++++******");
		System.out.println("Inserisci un valore per la base 2:");
		double base2 = myObj.nextDouble();
		System.out.println("Inserisci un valore per l'altezza 2:");
		double altezza2 = myObj.nextDouble();
		Rettangolo r2 = new Rettangolo(base2, altezza2);
		System.out.println("Perimetro rettangolo 2: " + r2.Perimetro());
		System.out.println("Area rettangolo 2: " + r2.Area());
		
		System.out.println("\n ******+++++ Somma dei due rettangoli +++++******");
		System.out.println("Perimetro tot: " + (r2.Perimetro() + r1.Perimetro()));
		System.out.println("Area tot: " + (r2.Area() + r1.Area()));

	}

}
