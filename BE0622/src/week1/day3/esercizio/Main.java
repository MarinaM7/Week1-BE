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
		
		printBest();
		PrintBestByGender('m');
		PrintBestByGender('f');
	}
	
	static void PrintBestByGender(char gender) {
		Student best = new Student("", "", new double[] {0},gender);
		for(int i = 0; i< students.length; i++) {
			if(students[i].getAvgVote() > best.getAvgVote() && students[i].genere == gender) {
				best = students[i];
			}
		}
		
		String message = "";
		
		switch (best.genere) {
		case 'm':
			message += "lo studente";
			break;
		case 'f':
			message += "la studentessa";
			break;
			
		default : 
		System.out.println("errore");
		}
		
		System.out.printf("%s migliore e`: %s con la media di: %.1f %n", message, best.getFullname(), best.getAvgVote());
		
	}
	
	
	static void printBest() {
		Student best = students[0];
		for(int i = 0; i<students.length; i++) {
			if(students[i].getAvgVote() > best.getAvgVote()) {
				best = students[i];
			}
		}
		System.out.println("Lo studente migliore è " + best.getFullname() + " con una media di " + best.getMedia());
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