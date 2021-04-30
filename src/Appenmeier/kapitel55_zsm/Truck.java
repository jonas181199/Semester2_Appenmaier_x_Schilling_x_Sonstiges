package Appenmeier.kapitel55_zsm;

public final class Truck extends Vehicle {

    private int cargo;
    private boolean isTransformed;//standardmäßig falsch


    public Truck(String make, String model, Engine engine, int cargo) {
        super(make, model, engine, 2);
        this.cargo = cargo;
    }

    public int getCargo(){
        return cargo;
    }

    public boolean isTransformed(){
        return isTransformed;
    }

    public void transform(){
        if(isTransformed){
            isTransformed = false;
            System.out.println(getMake() + " " + getModel() + " verwandelt sich zurück in einen Lastwagen"); //wenn schon transformiert dann zurücl
        } else {
            isTransformed = true;
            System.out.println(getMake() + " " + getModel() + " verwandelt sich in einen Autobot");
        }
    }

    public void print(){
        System.out.println(getMake() + " " + getModel() + " (" + getEngine().getDescription() + " - " + getCargo() + " t)");
    }
}
