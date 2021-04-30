package Appenmeier.Tutego161;

public class ElectronicDevice {

	private boolean isOn;
	
	public void on() {
		isOn = true;
	}
	
	public void off() {
		isOn = false;
	}
	
	
	public boolean isOn() {
		return isOn;
	}
	
	public String toString() {
		return "ElectronicDevice[is " + (isOn ? "on" : "off") + "]";
	}
}

