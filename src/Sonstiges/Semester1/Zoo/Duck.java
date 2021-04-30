package Sonstiges.Semester1.Zoo;
import de.dhbw.ravensburg.javazoo.interfaces.CarnivoreEatable;
import de.dhbw.ravensburg.javazoo.interfaces.Eatable;
import de.dhbw.ravensburg.javazoo.interfaces.Flying;
import de.dhbw.ravensburg.javazoo.interfaces.Omnivore;

/* 
 * This class represents a duck and is a child class to Bird.
 * The main extension compared to Bird is the ability to fly, which gets its own method as well as some
 * method overwrites to adjust the object to a more realistic representation.
 */
public class Duck extends Bird implements Flying, Omnivore, CarnivoreEatable {	
	public Duck(String name, int age, boolean female) {
		setName(name);
		setAge(age);
		setFemale(female);
	}
	
	public void move() {
		System.out.println("I walk like a Duck");
	}
	
	public void layEggs() {
		if(isFemale()) {
			if(getChildren().size() == 0) {
				System.out.println(getName() + " is laying eggs now:");
				addChild(new Duck("Melanie", 0, true));
				addChild(new Duck("Rudy", 0, false));
				listAllChildren();
			} else {
				System.err.println(getName() + " already has children!");
			}
		} else {
			System.err.println(getName() + " is male and cannot lay eggs!");
		}
	}
	
	/**
	 * This lets the Duck eat some foof of the Typ {@link Eatable} 
	 * @param food The food to be eaten by the Duck. 
	 */
	
	public void eat(Eatable food) {
		System.out.println("What a delicious " + food.getClass().getSimpleName() + " (says " + getName() + ")");
	}

	// Lets the duck fly - for which some wing flaps are required
	public void fly() {
		flapWings(5);
		System.out.println("I am " + getName() + " and I am flying now");
	}
	
	// Overwrite the inherited method sayName to adept it to a more specific phrase
	public void sayName() {
		System.out.println("Hello (quak) I am " + getName() + " the Duck");
	}
	
	
	/**
	 * Contructs a nice {@link String} representing the Duck.
	 * @return The String representation of the Duck. 
	 * 
	 */
	// Overwrite the inherited method toString to represent Duck objects in a nicer way when stringified
	public String toString() {
		return "I am " + getName() + " the duck (quak) and I am " + getAge() + " years old";
	}
}
