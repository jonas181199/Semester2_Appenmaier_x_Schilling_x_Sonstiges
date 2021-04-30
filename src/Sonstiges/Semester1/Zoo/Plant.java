package Sonstiges.Semester1.Zoo;
// Superclass to represent all different plants in the Zoo
public abstract class Plant extends Creature {

	// Overwrite the inherited method toString to represent Plant objects in a nicer way when stringified
	public String toString() {
		return getAge() + " years old " + this.getClass().getSimpleName();
	}
}
