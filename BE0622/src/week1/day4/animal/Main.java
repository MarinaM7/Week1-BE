package week1.day4.animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1 = new Dog("fuffy", 10);
		
		System.out.println(d1.getName());
		System.out.println(d1);
		
		d1.Roar();
		
		Cat c1 = new Cat("lilly", 2);
		
		System.out.println(c1.getName() + c1.getAge());
		
		// a1 è un nuovo Dog, ma io lo vedo come un Animal, ovvero con le funzionalità di Animal
		Animal a1 = new Dog("Vik",3);
	
	}
}
