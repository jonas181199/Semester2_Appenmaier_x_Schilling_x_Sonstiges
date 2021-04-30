package Appenmeier.kapitel52;

public class Truck extends Vehicle {
	
	public Truck(String make, String model, Engine engine, int cargo) {
		super(make, model, engine);
		this.cargo = cargo;
		
	}
	
	private int cargo;
	private boolean isTransformed;
	
	public int getCargo() {
		return cargo;
	}
	
	public boolean isTransformed() {
		if(isTransformed) {
			return true;
		} else {
			return false;
		}
	}
	
	public void transform(boolean isTransformed) {
		if(isTransformed) {
			System.out.println("Der LKW" + super.getMake() + super.getModel() + " wird in einen Autobot verwandelt.");
		} else {
			System.out.println( super.getMake() + super.getModel() + "verwandelt sich in einen LKW zurück.");
		}
	}
	
	public void print() {
		System.out.println(super.getMake() + 
				" " + super.getModel() + 
				" (" + super.getEngine() + " - " + cargo + " t)");
	}
	
	
}
//+ super.getSeats()