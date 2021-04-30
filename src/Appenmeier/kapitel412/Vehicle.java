package Appenmeier.kapitel412;



public class Vehicle {

	private String make;
	private String model;
	private int speed;
	private static int numberOfVehicles;
	private Engine engine;

//	public void setMake(String m) {
//		make = m;
//	}
//
//	public void setModel(String m) {
//		model = m;
//	}

	public Vehicle(String model, String make, Engine engine) {
		this.make = make;
		this.model = model;
		this.engine = engine;
		numberOfVehicles++;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public double getSpeed() {
		return speed;
	}

	public void accelerate(int s) {
		speed += s;
		System.out.println(make + " " + model + " beschleunigt auf " + speed + " km/h.");
	}

	public void brake(int s) {
		speed -= s;
		System.out.println(make + " " + model + " bremst auf " + speed + " km/h ab.");
	}

	public void print() {
		System.out.println(model + " " + make + ". Das ist der Motor: " + engine);
	}

	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}
	
	public Engine getEngine() {
		return engine;
	}

}
