package Appenmeier.kapitel61;

import Appenmeier.kapitel55_zsm.Engine;

/**
 * Fahrzeug
 *
 * @author Daniel Appenmaier
 */
public abstract class Vehicle {

    /*
     * Attribute
     */
    private String make;
    private String model;
    protected double speed;
    private Engine engine;

    private static int numberOfVehicles;

    /*
     * Methoden
     */
    public Vehicle(String make, String model, Engine engine, int i) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        numberOfVehicles++;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public final void accelerate(double speed) throws InvalidValueException {
        if (speed <= 0) {
            throw new InvalidValueException(speed);
        } else {
            this.speed += speed;
            System.out.println(make + " " + model + " beschleunigt auf " + speed + "km/h");
        }
    }

    public final void brake(double speed) throws InvalidValueException {
        if (speed <= 0) {
            throw new InvalidValueException(speed);
        } else {
            this.speed -= speed;
            System.out.println(make + " " + model + " bremst auf " + this.speed + "km/h ab");
        }
    }

    public double getSpeed() {
        return speed;
    }

    public abstract void print();

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }

}
