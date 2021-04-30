package Appenmeier.kapitel55;

public class Car extends Vehicle {

	private int seats;
	
	public Car(String make, String model, Engine engine, int seats) {
		super(make, model, engine);
		this.seats = seats;
	}
	
	
	
	public int getSeats() {
		return seats;
	}
	
	public void doATurboBoost(int speed) {
		speed *=2;
		System.out.println(super.getMake() + super.getModel() + " macht einen Turboboost und beschleunigt auf " + speed + " km/h.") ;
	}
	
	public void print() {
		System.out.println(super.getMake() +
				" " + super.getModel() + " (" + super.getEngine() +
				" - " + seats + " Sitzplätze)");
	}

}
