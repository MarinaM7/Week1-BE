package week1.day4.esercizio1;

public abstract class Car implements CarAction {

	private String name;
	private String color;
	private int maxSpeed;
	
	private boolean motoreAcceso;
	private int speed = 0;
	
	public Car(String name, String color, int maxSpeed) {
		
		this.name = name;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void getInfo() {
		System.out.println("L'auto " + this.name + " è " + this.color + " e viaggia a massimo " + this.maxSpeed + " km/h.");
		System.out.println("Motore acceso: " + motoreAcceso + "Velocità attuale: " + speed);
	}
	
	abstract public void run();
	
	public void accendi() {
		System.out.println("motore acceso");
		motoreAcceso = true;
	}
	public void spegni() {
		System.out.println("motore spento");
		motoreAcceso = false;
	}
	public void accelera() {
		System.out.println("...accelerando...");
		speed += 15;
		if (speed + 15 < maxSpeed) {
			speed +=15;
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	
}
