package Esercizio1;

import java.util.Scanner;

public class Es1 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = myObj.next();
		System.out.println("Numero di cratteri pari: " + PariDispari(str));
		
		
		System.out.println("Enter a year: ");
		int year = myObj.nextInt();
		System.out.println("Anno bisestile: " + Bisestile(year));
		
		myObj.close();
	}
		
		static Boolean PariDispari(String word) {
			if(word.length()%2 == 0) {
				return true;
			} else {
				return false;
			}
		}
		
		static Boolean Bisestile(int anno) {
			if(anno%4 == 0 || anno%100 == 0 && anno%400 == 0) {
				return true;
			} else {
				return false;
			}
		}
}

