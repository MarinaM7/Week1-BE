package es3;

public class Cliente {
	
	int cod;
	String fullName;
	String email;
	String date;
	
	public Cliente(int cod, String fullName, String email, String date) {
		this.cod = cod;
		this.fullName = fullName;
		this.email = email;
		this.date = date;
	}
	
	public String Stampa() {
		return "Il cliente numero " + this.cod + " si chiama " + this.fullName + "\n la sua mail è: " + this.email + " e si è unito al nostro sito in data " + this.date;
	}
}
