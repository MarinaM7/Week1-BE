package week1.day4.esercizio1;

public class Main {

	public static void main(String[] args) {
		// TODO
//		ex 1
//		realizzare un'app che gestisce automobili.
//		Le entità sono:
//		Car (name, color, maxSpeed,  metodi: run(), getInfo() )
//		SuperCar( price, run() ridefinito )
//
//		Realizzare un'array di automobili e stampare le info di ognuna. Se è una supercar, richiamare anche il metodo run.
//
//		ex 2
//		Realizzare la classe MyArray che accetta un array di interi. 
//		Possiede metodi: getMax, getMin, getEven, getOdd
		
		Car[] arrCar = new Car[] {
				new SuperCar("Volkswagen", "nera", 160),
				new UtilityCar("Ford", "bianca", 140),
				new SuperCar("Lancia", "panna", 130),
				new UtilityCar("Citroen", "blu", 110),
				new SuperCar("Porsche", "verde", 200),
		};
		
		for(Car c:arrCar ) {
			c.getInfo();
			if(c instanceof SuperCar) {
				c.run();
			}
		}
		
		arrCar[4].accendi();
		for(int i= 0; i<20; i++) {
			arrCar[4].accelera();
			System.out.println("Velocità attuale: " + arrCar[4].getSpeed());
		}
		arrCar[4].spegni();
		
		
		

	}

}
