package week1.day4.infoHiding;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		//setName(name);
		setAge(age);
	}
	
	public void setAge(int a) {
		if(a < 0 || a > 120) {
			//PersonError.printError("age");
			return;
		}
	}
	
}
