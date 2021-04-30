package Appenmeier.kapitel53;

public class Ausfuehr53 {



	public static void main(String[] args) {
		
//		System.out.println("Anzahl der Fahrzeuge: " + Vehicle.getNumberOfVehicles());
//		System.out.println();
		
		Rental r1 = new Rental("Autovermietung Schirm");
		
		Car c1 = new Car("Porsche", "Boxter", Engine.GAS, 4);
		Car c2 = new Car("Audi", "A8", Engine.DIESEL, 5);
		Car c3 = new Car("BMW", "M6", Engine.PETROL, 4);
				
		Truck t1 = new Truck ("MAN", "550", Engine.DIESEL, 25);
		Truck t2 = new Truck ("Volvo", "V1000", Engine.ELECTRO, 20);
		Truck t3 = new Truck ("OPEL", "7", Engine.GAS,18);
		
		
		
		
		r1.addVehicle(t3);
		r1.addVehicle(t2);
		r1.addVehicle(t1);
		r1.addVehicle(c3);
		r1.addVehicle(c2);
		r1.addVehicle(c1);
		
		r1.print();
		r1.transformAllTrucks();
		
//		System.out.println("Anzahl der Fahrzeuge: " + Vehicle.getNumberOfVehicles());
//		System.out.println();
//		
//		c1.print();
//		c2.print();
//		c3.print();
//		
//		System.out.println();
//		
//		t1.print();
//		t2.print();
//		t3.print();
//		
//		System.out.println();
//
//		c1.accelerate(90);
//		c2.doATurboBoost(50);
		
	}

	
		
	}


