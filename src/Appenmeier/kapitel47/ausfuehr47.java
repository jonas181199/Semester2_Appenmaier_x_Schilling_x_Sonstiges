package Appenmeier.kapitel47;

public class ausfuehr47 {

	public static void main(String[] args) {

		System.out.println("Anzahl der Fahrzeuge: " + Vehicle.getNumberOfVehicles());
		
		Vehicle v3 = new Vehicle("Porsche", "911");
		Vehicle v2 = new Vehicle("Mercedes-Benz", "SLK");
		Vehicle v1 = new Vehicle("BMW", "i8");
	
		System.out.println("Anzahl der Fahrzeuge: " + Vehicle.getNumberOfVehicles());
		
		v1.print();
		v2.print();
		v3.print();
	}

}
