package Appenmeier.kapitel41u2;

public class Vehicle {

	private String make;
	private String model;
	private int speed;

//	public void setMake(String m) {
//		make = m;
//	}
//
//	public void setModel(String m) {
//		model = m;
//	}
	
	public Vehicle(String model, String make) {
		this.make = make; 
		this.model = model;
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
		System.out.println(make + " " + model +  " beschleunigt auf " + speed + " km/h.");
	}

	public void brake(int s) {
		speed -= s;
		System.out.println(make + " " + model + " bremst auf " + speed + " km/h ab.");
	}

	public void print() {
		System.out.println(make + " " + model);
	}

}
