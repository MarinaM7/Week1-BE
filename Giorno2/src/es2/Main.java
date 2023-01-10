package es2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		String num = "3453456243";
		
		double h = 0.0;
		
		Sim person1 = new Sim(num, h);
		person1.chiamate[0] = "3405347677";
		person1.chiamate[1] = "3335345008";
		person1.chiamate[2] = "3033452129";
		person1.chiamate[3] = "3455345343";
		person1.chiamate[4] = "3455345000";

		System.out.println(person1.Stampa());
		
		System.out.println("Inserisci la ricarica che vuoi effettuare:");
		double ric = myObj.nextDouble();
		
		System.out.println( "Dopo la ricarica il tuo credito ammonta a: " + person1.Credito(ric) + " euro");
		
		

	}

}
