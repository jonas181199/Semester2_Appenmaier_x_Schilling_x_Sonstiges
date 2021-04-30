package Sonstiges.Semester1.Zoo;
import de.dhbw.ravensburg.javazoo.interfaces.CarnivoreEatable;
import de.dhbw.ravensburg.javazoo.interfaces.Flying;
import de.dhbw.ravensburg.javazoo.interfaces.Herbivore;
import de.dhbw.ravensburg.javazoo.interfaces.HerbivoreEatable;

/* 
 * This class represents a hummingbird and is a child class to Bird.
 * The main extension compared to Bird is the ability to fly, which gets its own method.
 * All other members stay the same.
 */
public class Hummingbird extends Bird implements Flying, Herbivore, CarnivoreEatable {
	public Hummingbird(String name, int age, boolean female) {
		setName(name);
		setAge(age);
		setFemale(female);
	}
	
	public void move() {
		System.out.println("I can only fly really");
		fly();
	}
	
	public void layEggs() {
		if(isFemale()) {
			if(getChildren().size() == 0) {
				System.out.println(getName() + " is laying eggs now:");
				addChild(new Hummingbird("Jacinda", 0, true));
				addChild(new Hummingbird("Scott", 0, false));
				addChild(new Hummingbird("Bryana", 0, true));
				listAllChildren();
			}else {
				System.err.println(getName() + " already has children!");
			}
		} else {
			System.err.println(getName() + " is male and cannot lay eggs!");
		}
	}
	
	public void eat(HerbivoreEatable food) {
		System.out.println("What delicious " + food.getClass().getSimpleName() + " (says " + getName() + ")");
	}
	
	// Lets the hummingbird fly - for which many wing flaps are required
	public void fly() {
		flapWings(20);
		System.out.println("I'm flying now");
	}
}
