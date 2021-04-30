package Appenmeier.kapitel43;

public class Dicen {

	public static void main(String[] args) {
		
		Dice dice = new Dice(1);
		
		System.out.println("ID und Würfelergebnis");
		for (int i = 0; i <= 5; i++) {
			dice.rollTheDice();
			System.out.println(dice.getId() + " - " + dice.getValue());
		}
		

	}

}
