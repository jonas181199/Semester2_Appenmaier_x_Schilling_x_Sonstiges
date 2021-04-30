package Appenmeier.kapitel415;

public class Kampf {

	public static void main(String[] args) {
		
		Creature creature1 = new Creature("Pikachu", 200, 4000);
		Creature creature2 = new Creature("Glumanda", 250, 3600);
		
		CreatureGame colosseum = new CreatureGame(creature1, creature2);
		colosseum.simulateFight();

	}

}
