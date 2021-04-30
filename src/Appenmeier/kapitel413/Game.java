package Appenmeier.kapitel413;

public class Game {

	public static void main(String[] args) {
		
		Playerj j = new Playerj ("Jonas");
		Playerj s = new Playerj ("Sophia");
		
		Dice dice1 = new Dice(1);
		Dice dice2 = new Dice(2);
		
		dice1.rollTheDice();
		System.out.println(j.getName() + " würfelt eine " + dice1.getValue());
		dice2.rollTheDice();
		System.out.println(s.getName() + " würfelt eine " + dice2.getValue());
		
		if(dice2.getValue()>dice1.getValue()) {
			System.out.println(s.getName() + " gewinnt.");
		} else if (dice1.getValue()>dice2.getValue()) {
			System.out.println(j.getName() + " gewinnt.");
		} else {
			System.out.println("Unentschieden.");
		}
		
		
		
		

	}

}
