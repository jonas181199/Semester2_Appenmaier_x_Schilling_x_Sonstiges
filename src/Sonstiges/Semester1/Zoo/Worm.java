package Sonstiges.Semester1.Zoo;
import de.dhbw.ravensburg.javazoo.interfaces.CarnivoreEatable;

public class Worm extends Animal implements CarnivoreEatable {
	public void move() {
		System.out.println("Crawling around");
	}
}
