
public class Giorno2 {

	public static void main(String[] args) {
		// creo le istanze Human
		Human h1 = new Human();
		h1.firstName = "Mario";
		h1.lastName = "Rossi";
		System.out.print(h1.firstName + " " + h1.lastName);
		h1.sayHello();
		
		for(int i = 1; 1 <= 10; i++) {
			System.out.print("ciao" + h1.firstName + "x" + i);
		}
		
	}
}

//

class Human {

	String firstName, lastName;
	
	void sayHello() {
		System.out.print("hello, i am human");
	}
	
}