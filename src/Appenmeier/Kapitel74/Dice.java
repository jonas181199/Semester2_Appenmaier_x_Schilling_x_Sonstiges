package Appenmeier.Kapitel74;

import javafx.scene.image.Image;

import java.util.Random;

public class Dice {

	private int id;
	private int value;
	private Image image;
	
	public Dice(int i) {
		this.id = i;
		rollTheDice();
	}
	
	public int getId() {
		return id;
	}
	
	public int getValue() {
		return value;
	}
	
	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(6) + 1;
	}

	public Image getImage() {
		return image;
	}
}
