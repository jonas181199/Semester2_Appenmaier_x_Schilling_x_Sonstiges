package Appenmeier.kapitel52_zsm;

public class Exercise0502 {

	public static void main(String[] args) {



		Car c1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Truck t1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
		Car c2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 4);
		Rental r1 = new Rental("Fahrzeugvermietung Schirm");

		r1.addVehicle(c1); //Upcast --> Referenz auf Objekt der Klasse Auto
		r1.addVehicle(t1); //Upcast --> Referenz auf Objekt der Klasse Truck


	}

}
