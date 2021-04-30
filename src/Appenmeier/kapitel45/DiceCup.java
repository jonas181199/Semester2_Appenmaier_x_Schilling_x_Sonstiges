package Appenmeier.kapitel45;

import java.util.ArrayList;

public class DiceCup {

	public void rollTheDices(ArrayList<Dice> dices) {
		for (int i = 0; i<dices.size(); i++) {
			Dice d = dices.get(i);
			d.rollTheDice();
			System.out.println(d.getId() + " - " + d.getValue());
		}
	}
	
	public void rollTheDices(Dice[] dices) {
		for(int i= 0; i < dices.length;i++) {
			Dice d = dices[i];
			d.rollTheDice();
			System.out.println(d.getId() + " - " + d.getValue());
		}
		
	}
	
	
	
	
	
	
	
	
}
