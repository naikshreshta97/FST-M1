package Activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color, String transmission, int make, int tyres, int doors){
		this.color=color;
		this.transmission = transmission;
		this.make=make;
		this.tyres=tyres;
		this.doors=doors;
		
	}
	
	public void displayCharacteristics() {
		System.out.println("The color is "+color);
		System.out.println("The transmission is "+transmission);
		System.out.println("The make is "+make);
		System.out.println("The no of tyres is "+tyres);
		System.out.println("The no of doors is "+doors);
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped.");
	}

}
