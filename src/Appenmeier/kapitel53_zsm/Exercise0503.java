package Appenmeier.kapitel53_zsm;

public class Exercise0503 {

	public static void main(String[] args) {



		Car c1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Truck t1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
		Car c2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 4);
		Rental r1 = new Rental("Fahrzeugvermietung Schirm");
		Truck t2 = new Truck("Mercedes", "Actros", Engine.DIESEL, 25);

		r1.addVehicle(c1); //Upcast --> Referenz auf Objekt der Klasse Auto
		r1.addVehicle(t1);
		r1.addVehicle(t2);
		r1.print();
		System.out.println();
		r1.transformAllTrucks();//Upcast --> Referenz auf Objekt der Klasse Truck


	}

}
