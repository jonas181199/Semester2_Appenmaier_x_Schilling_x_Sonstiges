package Appenmeier.kapitel44;

import java.util.ArrayList;

public class Dicen {

	public static void main(String[] args) {
		
		ArrayList<Dice> dices = new ArrayList<>();
		
		for(int i = 1; i<=5; i++) {
			Dice dice = new Dice(i);
			dices.add(dice);
		}
		
		System.out.println("ID und Würfelergebnis");
		for (Dice dice : dices) {
			dice.rollTheDice();
			System.out.println(dice.getId() + " - " + dice.getValue());
		}
		

	}

}
