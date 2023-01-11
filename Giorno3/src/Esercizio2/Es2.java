package Esercizio2;

import java.util.Scanner;

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int numero = myObj.nextInt();
		
		myObj.close();
		
		switch(numero) {
			case 0:  
				System.out.print("il numero è zero");
				break;
			case 1:  
				System.out.print("il numero è due");
				break;
			case 2:  
				System.out.print("il numero è due");
				break;
			case 3:  
				System.out.print("il numero è tre");
				break;
			default: 
				System.out.print("il numero inserito è maggiore di tre");
		}
		
	}
}
