package week1.day3.esercizio;

public class Main {
	
	static Student[] students;

	public static void main(String[] args) {
		
		students = new Student[] {
			new Student("Mario", "Rossi", new double[] {9,6,7}, 'm'),
			new Student("Marco", "Verdi", new double[] {10,5,6}, 'm'),
			new Student("Giulia", "Gialli", new double[] {9,4,8}, 'f'),
			new Student("Anna", "Bianchi", new double[] {7,7,6}, 'f'),
			new Student("Paolo", "Neri", new double[] {9,4,5}, 'm'),
			new Student("Gina", "Stinky", new double[] {9,10,7}, 'f')
			};

	}
	
	static void printBestM() {
		
	}
	
	static void printBestF() {
		
	}
	static void printBest() {
	
	}

}
	
/*
		Creare un'applicazione che simula una "classe scolastica".
		 
		Realizzare un Main per eseguire l'applicazione e una classe Student nel package school.objects

		Lo studente avrà: nome, cognome, array di voti (double), genere (m/f)
		metodi: getFullname(), getAvgVote()

		Nel main, realizzare un array di 5 studenti con valori a piacere.
		Tramite apposite strategie algoritmiche:

		Determinare: lo studente migliore della classe.
		Determinare: la studentessa migliore della classe.
		Determinare: il/la migliore in assoluto della classe.
*/