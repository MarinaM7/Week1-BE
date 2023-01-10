package it.epicode.be;

import java.util.Scanner;

public class Es3 {

	public static void main(String[] args) {
		
		// array a inserimento
		
		Scanner myObj = new Scanner(System.in);
		
		String[] nomi = new String[3];        
	    System.out.print("Enter 3 Student names: ");
	    for(int i =0;i<nomi.length;i++){
	    nomi[i] = myObj.next();
	    }
	    System.out.println(java.util.Arrays.toString(nomi));
	}

}
