package Sonstiges.Semester1.Zoo;
import java.util.ArrayList;


import java.util.Collection;

import de.dhbw.ravensburg.javazoo.interfaces.Herbivore;
import de.dhbw.ravensburg.javazoo.interfaces.Omnivore;


/**
 * 
 * A Zoo containing a {@link Collection} of {@link Animal}s.
 * @author jonasschirm
 *@version 1.0
 */

public class Zoo {
	
	/*
	 * The link {@link Collection} containing all {@link Animal}s of the Zoo.
	 */
	// These attributes represent different animal enclosures, listing animals according to their species
	private Collection<Animal> allAnimals;
	
	// When a new Zoo object is created, its enclosures are populated with some birds
	public Zoo() {
		allAnimals = new ArrayList<>();

		allAnimals.add(new Duck("Freddy", 5, false));
		allAnimals.add(new Duck("Tina", 4, true));
		
		allAnimals.add(new Ostrich("Harry", 2, false));

		allAnimals.add(new Hummingbird("Alice", 1, true));
		allAnimals.add(new Hummingbird("Tom", 2, false));
	}
	
	
	/*
	 * Lists all {@link Animal}s living in the Zoo by printing them out.
	 */
	
	// All animals, currently living in the Zoo are listed in the console
	public void listAllAnimals() {
		System.out.println("There are " + allAnimals.size() + " animals in the zoo:");

		for(Animal currentAnimal : allAnimals) {
			if(currentAnimal != null) {
				currentAnimal.sayName();
			}
		}
	}
	
	// Give all animals in the Zoo something to eat
	public void feedAllAnimals() {
		System.out.println("Feeding all animals...");

		for(Animal currentAnimal : allAnimals) {
			if(currentAnimal != null) {
				if(currentAnimal instanceof Herbivore) {
					Herbivore herbivore = (Herbivore) currentAnimal;
					herbivore.eat(new Grass());
				} else if(currentAnimal instanceof Omnivore) {
					Omnivore omnivore = (Omnivore) currentAnimal;
					omnivore.eat(new Worm());
				}
			}
		}
	}
	
	// This frees all animals by removing them from their arrays
	public void freeAllAnimals() {
		System.out.println("Freeing all animals...");
		allAnimals.clear();
	}
	
	public void breedingSeason() {
		Collection<Animal> allNewAnimals = new ArrayList<>();
		
		for(Animal currentAnimal : allAnimals) {
			if(currentAnimal instanceof Bird) {
				Bird bird = (Bird) currentAnimal;
				if(bird.isFemale()) {
					bird.layEggs();
					allNewAnimals.addAll(bird.getChildren());
				}
			}
		}
		
		allAnimals.addAll(allNewAnimals);
	}
}
