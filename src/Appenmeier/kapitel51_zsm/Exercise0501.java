package Appenmeier.kapitel51_zsm;

public class Exercise0501 {

	public static void main(String[] args) {

		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());

		Car c1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Truck t1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
		Car c2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 4);

		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());
		System.out.println();

		c1.print();
		t1.print();
		c2.print();

		System.out.println();

		c1.accelerate(20);
		t1.transform();
		c1.doATurboBoost();
		t1.transform();

	}

}
