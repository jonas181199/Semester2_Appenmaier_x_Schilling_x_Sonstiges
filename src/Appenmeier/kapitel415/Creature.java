package Appenmeier.kapitel415;

public class Creature {

	private String name;
	private int attackValue;
	private int hitPoints;

	public Creature(String name, int attackValue, int hitpoints) {
		this.name = name;
		this.attackValue = attackValue;
		this.hitPoints = hitpoints;
	}

//	public void attackCreature(Creature creature) {
//		creature.hitPoints -= this.attackValue;
//		System.out.println(this.name + " greift " + creature.name + " an und erzielt " + this.attackValue + " Schaden.");
//		System.out.println(creature.name + " hat noch " + creature.hitPoints + " Lebenspunkte.");
//	}
	public boolean attackCreature(Creature creature) {
		System.out.println(this.name + " greift " + creature.name + " an und erzielt " + this.attackValue + " Schaden!");
		if (this.attackValue >= creature.hitPoints) {
			creature.hitPoints = 0;
			System.out.println(creature.name + " wurde vernichtet!");
			return true;
		} else {
			creature.hitPoints -= this.attackValue;
			System.out.println(creature.name + " hat noch " + creature.hitPoints + " Lebenspunkte!");
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public int getAttackValue() {
		return attackValue;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints (int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public void print() {
		System.out.println(name + "(" + attackValue + " - " + hitPoints);
	}

}
