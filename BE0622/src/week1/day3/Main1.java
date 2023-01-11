package week1.day3;

public class Main1 {
	public static void main(String[] args) {

		// switch case
		int x = 10, y = x++, z = y - 2;

		switch (z) {
		default:
			System.out.println("red");
			break;
		case 8:
			System.out.println("green");
		case 9:
			System.out.println("blue");
			break;
		}

		// ciclo while
		int q = 6, w = 3;

		while (w <= q + 6) {
			System.out.println(w);
			w += 3;
		}

		// ciclo for con uso di continue
		System.out.println("Results");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				continue;
			// continue fa andare avanti la lettura
			// se la condizione è vera allora il ciclo continua
			// rilegge il for e va avanti
			System.out.println(i);
		}

	}
}
