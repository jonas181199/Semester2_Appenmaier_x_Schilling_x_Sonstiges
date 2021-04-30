package Sonstiges.Semester1.Zoo;
// Superclass to represent all different animals in the Zoo
public abstract class Animal extends Creature {
	private String name;

	// Makes the animal move
	public abstract void move();
	

	// Getter-Method for attribute name
	public String getName() {
		return name;
	}
	
	// Setter-Method for the attribute name
	public void setName(String name) {
		this.name = name;
	}

	// Prompts the bird to say its name (dependent on the attribute value)
	public void sayName() {
		System.out.println("Hello I am " + getName() + " the " + this.getClass().getSimpleName());
	}
	
	// Overwrite the inherited method toString to represent Animal objects in a nicer way when stringified
	public String toString() {
		return "I am " + getName() + " the " + this.getClass().getSimpleName() + " and I am " + getAge() + " years old";
	}
}
