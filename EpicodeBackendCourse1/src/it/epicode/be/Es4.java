package it.epicode.be;

import java.util.Scanner;

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("***** RETTANGOLO *****");
		System.out.println("Inserisci un valore per la base:");
		int base = myObj.nextInt();
		System.out.println("Inserisci un valore per l'altezza:");
		int altezza = myObj.nextInt();
		int perimetro = calcola(base,altezza);
		int area = area(base,altezza);
		
		System.out.println("Il perimetro misura: " + perimetro + " m");
		System.out.println("L'area misura: " + area + " mquad");
		
		
	}
	
	private static int calcola(int base, int altezza) {
		return base*2 + altezza*2;
	}
	
	private static int area(int base, int altezza) {
		return base*altezza;
	}

	

}
