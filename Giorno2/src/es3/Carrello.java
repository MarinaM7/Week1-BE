package es3;

public class Carrello {

	String client;
	int articles;
	double checkout;
	
	public Carrello(String client, int articles, double checkout) {
		this.client = client;
		this.articles = articles;
		this.checkout = checkout;
	}
}
