package es1;

public class Rettangolo {
	double base;
	double altezza;

	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public int Perimetro() {
		return (int) (this.base * 2 + this.altezza * 2);
	}

	public int Area() {
		return (int) (this.base * this.altezza);
	}
}
