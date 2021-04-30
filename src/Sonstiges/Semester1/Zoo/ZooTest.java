package Sonstiges.Semester1.Zoo;

public class ZooTest {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		zoo.listAllAnimals();
		System.out.println("-----------------------");
		zoo.feedAllAnimals();
		System.out.println("-----------------------");
		zoo.breedingSeason();
		System.out.println("-----------------------");
		zoo.listAllAnimals();
		System.out.println("-----------------------");
		zoo.breedingSeason();
		System.out.println("-----------------------");
		zoo.listAllAnimals();
	}
}
