package Appenmeier.kapitel41u2;

public class RunVehicle {

	public static void main(String[] args) {
		
		Vehicle p = new Vehicle("MB", "C63");
		p.accelerate(30);
		p.accelerate(60);
		p.brake(40);
		p.accelerate(150);
		p.brake(70);
		
	}

}
