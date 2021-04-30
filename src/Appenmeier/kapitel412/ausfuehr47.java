package Appenmeier.kapitel412;



public class ausfuehr47 {

	public static void main(String[] args) {

		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());

		Vehicle v1 = new Vehicle("Porsche", "911", Engine.PETROL);
		Vehicle v2 = new Vehicle("MAN", "TGX", Engine.DIESEL);
		Vehicle v3 = new Vehicle("Opel", "Zafira Life", Engine.GAS);

		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());
		System.out.println();

		v1.print();
		v2.print();
		v3.print();
		
	}

}
