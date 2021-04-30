package Appenmeier.kapitel56_zsm;

public class Exercise0506 {

	public static void main(String[] args) {


		TravelAgency ta1 = new TravelAgency("Reisbüro Schiller");
		Car c1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Truck t1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
		Car c2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 4);
		Rental r1 = new Rental("Fahrzeugvermietung Schirm");
		Truck t2 = new Truck("Mercedes", "Actros", Engine.DIESEL, 25);

		r1.addVehicle(c1); //Upcast --> Referenz auf Objekt der Klasse Auto
		r1.addVehicle(t1);
		r1.addVehicle(t2);
		r1.addVehicle(c2);

		ta1.addPartner(r1); //upcast
		ta1.print();




	}

}
