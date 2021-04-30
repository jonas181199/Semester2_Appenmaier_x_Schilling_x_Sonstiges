package Appenmeier.kapitel53;

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

		return isTransformed;

		//if(isTransformed) {
		//	return true;
		//} else {
		//	return false;
		//}

	}
	
	public void transform() {

		isTransformed = !isTransformed;

		if(isTransformed){
			System.out.println(super.getMake() + " " + super.getModel() + " verwandelt sich in einen Autobot.");
		} else {
			System.out.println(super.getMake() + " " + super.getModel() + " verwandelt sich zurück.");
		}
		//if(isTransformed) {
		// }
		//else {
		//	isTransformed = true;
		//}
	}
	
	public void print() {
		System.out.println(super.getMake() + 
				" " + super.getModel() + 
				" (" + super.getEngine() + " - " + cargo + " t)");
	}
	
	
}
//+ super.getSeats()