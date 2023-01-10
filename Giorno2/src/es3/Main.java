package es3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente one = new Cliente(056, "Mario Rossi", "mariorossi@gmail.com", "12/07/10");
		
		System.out.println(one.Stampa());
		

		System.out.println("Ora crea tu il tuo cliente...");
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Inserisci il codice cliente:");
		int cod = myObj.nextInt();
		
		System.out.println("Inserisci il nome completo del cliente (no spazi):");
		String name = myObj.next();
		
		System.out.println("Inserisci la email cliente:");
		String email = myObj.next();
		
		System.out.println("Inserisci la data di accesso:");
		String date = myObj.next();
		
		Cliente two = new Cliente(cod, name, email, date);
		
		System.out.println(two.Stampa());
		
		
	}

}
