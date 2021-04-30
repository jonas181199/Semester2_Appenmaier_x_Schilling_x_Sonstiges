package Appenmeier.kapitel55_zsm;

public final class Car extends Vehicle {

    private int seats;

    public Car(String make, String model, Engine engine, int seats) {
        super(make, model, engine, 2);
        this.seats = seats;
    }

    public int getSeats(){
        return seats;
    }

    public void doATurboBoost(){
        speed *=2;
        System.out.println(getMake() + " " + getModel() + " macht einen Turboboost und beschleunigt auf " + speed + " km/h.");
    }

    public void print(){
        System.out.println(getMake() + " " + getModel() + " (" + getEngine().getDescription()+ ", " + seats + " Sitzplätze" +")");
    }

}


