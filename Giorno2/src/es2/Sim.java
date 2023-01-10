package es2;

public class Sim {
	String numero;
	double credito;
	String[] chiamate;

	public Sim(String num, double h) {
		this.numero = num;
		this.credito = h;
		this.chiamate = new String[5];
	}

	public String Stampa() {
		return "Il tuo credito sul numero " + this.numero + " è " + this.credito + " euro \n e hai eseguito 5 chiamate ai seguenti numeri " + java.util.Arrays.toString(this.chiamate) ;
	}
	
	public double Credito(double ric) {
		return this.credito + ric;
	}
}
