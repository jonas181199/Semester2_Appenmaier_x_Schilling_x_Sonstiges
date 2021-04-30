package Appenmeier.kapitel55;

import java.util.ArrayList;

public class Rental {

	private String name;

	ArrayList<Vehicle> vehicles = new ArrayList<>();
	Vehicle vehicle;

//	Truck truck1 = new Truck("MAN", "S500", Engine.DIESEL, 26);
//	Truck truck2 = new Truck("MB", "St200", Engine.PETROL, 20);

	public Rental(String name) {
		this.name = name;
	}

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public void transformAllTrucks() { 
		for (Vehicle v : vehicles) {
			if (v instanceof Truck) { //downcast
				if (((Truck) v).isTransformed()) {
					System.out.println(v.getMake() + " " + v.getModel() + " sagt: I am already transformed bro!");
				} else {
					((Truck) v).transform(true);
				}
			}

		}
	}

	public void print() {
		System.out.println(this.name);
		System.out.println();
		System.out.println("Unsere Fahrzeuge:");
		for (Vehicle v : vehicles) {
			v.print(); // alle Vehicle print
		}

	}

}
