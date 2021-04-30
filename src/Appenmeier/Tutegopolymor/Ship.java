package Appenmeier.Tutegopolymor;

import java.util.ArrayList;

public class Ship extends ElectronicDevice {

	ArrayList<ElectronicDevice> devices = new ArrayList<> ();
	
	public void holiday() {
		for (ElectronicDevice device : devices) {
			device.off();
		}
	}
	
	
}
