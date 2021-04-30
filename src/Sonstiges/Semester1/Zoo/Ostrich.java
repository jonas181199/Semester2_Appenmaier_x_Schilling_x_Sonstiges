package Sonstiges.Semester1.Zoo;
import de.dhbw.ravensburg.javazoo.interfaces.CarnivoreEatable;
import de.dhbw.ravensburg.javazoo.interfaces.Herbivore;
import de.dhbw.ravensburg.javazoo.interfaces.HerbivoreEatable;

/* 
 * This class represents an ostrich and is a child class to Bird.
 * As the model of an ostrich is very close to that of an average Bird (in the context of this particular zoo)
 * only a constructor is added to the class.
 */
public class Ostrich extends Bird implements Herbivore, CarnivoreEatable {
	public Ostrich(String name, int age, boolean female) {
		setName(name);
		setAge(age);
		setFemale(female);
	}
	
	public void layEggs() {
		if(isFemale()) {
			if(getChildren().size() == 0) {
				System.out.println(getName() + " is laying eggs now:");
				addChild(new Ostrich("Ariana", 0, true));
				listAllChildren();
			} else {
				System.err.println(getName() + " already has children!");
			}
		} else {
			System.err.println(getName() + " is male and cannot lay eggs!");
		}
	}
	
	public void move() {
		System.out.println("Runnin'");
	}
	
	public void eat(HerbivoreEatable food) {
		System.out.println("What delicious " + food.getClass().getSimpleName() + " (says " + getName() + ")");
	}
}
