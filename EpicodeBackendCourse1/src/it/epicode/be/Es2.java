package it.epicode.be;

import java.util.Scanner;
import java.util.Arrays;

public class Es2 {

	public static void main(String[] args) {
		
				// numeri e moltipl
				int a = 12;
				int b = 34;
				int moltiplica = moltiplica(a, b);
				System.out.println("Result: " + moltiplica);
				
				// stringa concaten
				String nome = "Marco";
				String concat = concatena(nome);
				System.out.println(concat);
				
				
				// array 1
				Scanner myObj = new Scanner(System.in);
				String[] arr = new String [5];
				arr[0] = "cielo";
				arr[1] = "spiaggia";
				arr[2] = "casa";
				arr[3] = "montagna";
				arr[4] = "mare";
				System.out.println(java.util.Arrays.toString(arr));
				System.out.println("Inserisci un valore da sostituire al secondo posto dell'array:");
				String add = myObj.next();
				arr[1] = add;
				System.out.println(java.util.Arrays.toString(arr));
			    
			    // array 2
			    int[] ax = { 1, 2, 4, 5, 6 };
			    System.out.println(Arrays.toString(ax));
			    System.out.println("Inserisci un numero da mettere al terzo posto dell'array:");
				int key = myObj.nextInt();
		        int index = 2;
		        ax = insert(ax, key, index);
		        System.out.println(Arrays.toString(ax));
	}
	
	public static int moltiplica(int a, int b) {
		return a+b;
	}
	
	public static String concatena(String nome) {
		return "Il mio nome è " + nome + " e ho " + moltiplica(12, 24) + " anni.";
	}
	
	private static int[] insert(int[] a, int key, int index)
    {
        int[] result = new int[a.length + 1];
 
        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }
 
        result[index] = key;
 
        for (int i = index + 1; i <= a.length; i++) {
            result[i] = a[i - 1];
        }
 
        return result;
    }


}
