package Appenmeier.kapitel46;

public class Creaturenkampf {

	public static void main(String[] args) {
		
		Creature pikachu = new Creature("Pikachu", 80, 4000);
		Creature glumanda = new Creature("Glumanda", 75, 4100);
		glumanda.attackCreature(pikachu);
//		glumanda.getHitPoints();
		pikachu.attackCreature(pikachu);
//		pikachu.getHitPoints();
		glumanda.attackCreature(pikachu);
//		glumanda.getHitPoints();
		pikachu.attackCreature(pikachu);
//		pikachu.getHitPoints();

	}

}
