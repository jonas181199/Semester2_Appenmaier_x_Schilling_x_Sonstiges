package Appenmeier.kapitel415;

public class CreatureGame {

	Creature creature1;
	Creature creature2;
	
	private int noRounds;
	
	public CreatureGame(Creature creature1, Creature creature2) {
		this.creature1 = creature1;
		this.creature2 = creature2;
	}
	
	public void simulateFight() {
		noRounds = 0;
		while (true) {
			print();
			if (move(creature1, creature2)) {
				break;
			}
			if (move(creature2, creature1)) {
				break;
			}
			System.out.println();
			noRounds++;
		}
		
	}
	
	
	private boolean move(Creature player, Creature enemy){
		return player.attackCreature(enemy);
	}
	
	private void print() {
		System.out.println("Runde: " + noRounds + "! "+ creature1.getName() + " (" + creature1.getAttackValue() + " - " + creature1.getHitPoints() + ") & " + creature2.getName() + "(" + creature2.getAttackValue() + " - " + creature2.getHitPoints() + ")");
	}

}
