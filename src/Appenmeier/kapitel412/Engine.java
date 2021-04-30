package Appenmeier.kapitel412;

public enum Engine {

	DIESEL("Diesel"), PETROL("Benzin"), GAS("Autogas"), ELECTRO("Elektro");
	
	
	private String description;
	
	private Engine(String m) {
		this.description = m;
	}
	
	public String getDescription() {
		return description;
	}
	
	
}
