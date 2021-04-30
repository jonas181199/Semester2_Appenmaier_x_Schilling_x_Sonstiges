package Sonstiges.Semester1.Zoo;
import java.util.ArrayList;
import java.util.Collection;

// Superclass for all birds in the zoo, including flying and non-flying ones
public abstract class Bird extends Animal {
	private boolean female;
	private Collection<Bird> children;
	
	public Bird() {
		children = new ArrayList<>();
	}
	
	// Prompts the bird to lay one or more eggs (depending on the species)
	public abstract void layEggs();
	
	
	// This lets the bird flap with its wings, by specifying how many times the wings should be flapped (flapCount)
	public void flapWings(int flapCount) {
		for(int i = 0; i < flapCount; i++) {
			System.out.println("Flap");
		}
	}
	
	public void addChild(Bird child) {
		children.add(child);
	}
	
	public void listAllChildren() {
		System.out.println(getName() + "'s Children:");
		for(Bird currentBird : children) {
			System.out.println(currentBird);
		}
	}
	
	public Collection<Bird> getChildren() {
		return children;
	}
	
	// Overwrite the Super-Class Setter-Method for the attribute age in order to further restrict the validation to a range between 0 and 49
	public void setAge(int age) {
		if(age >= 0 && age < 50) {
			super.setAge(age);
		} else {
			System.err.println("Invalid age: " + age);
		}
	}
	
	public boolean isFemale() {
		return female;
	}
	
	public void setFemale(boolean female) {
		this.female = female;
	}
}
