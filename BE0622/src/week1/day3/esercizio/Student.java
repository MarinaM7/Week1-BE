package week1.day3.esercizio;

public class Student {
	
	String nome;
	String cognome;
	double[] voti;
	char genere;
	
	public Student(String nome, String cognome, double[] voti, char genere) {
		this.nome = nome;
		this.cognome = cognome;
		this.voti = voti;
		this.genere = genere;
		
	}
	

	public String getFullname() {
		return this.nome + " " + this.cognome;
	}
	
	public double getAvgVote() {
		
		double sum = 0;
	
		for (int i = 0; i < this.voti.length; i++) {
			
			sum += this.voti[i];
		}
		
		return sum/this.voti.length;
		
	}
	
}
