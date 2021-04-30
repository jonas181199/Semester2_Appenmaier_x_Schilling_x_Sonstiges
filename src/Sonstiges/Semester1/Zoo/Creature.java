package Sonstiges.Semester1.Zoo;
// Superclass to provide a common type for all living beings in the Zoo
public abstract class Creature {
	private int age;

	// Getter-Method for attribute age
	public int getAge() {
		return age;
	}
	
	// Setter-Method for the attribute age. It is also validated to be greater or equal to 0
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		} else {
			System.err.println("A Creature's age cannot be smaller than 0");
		}		
	}
}
