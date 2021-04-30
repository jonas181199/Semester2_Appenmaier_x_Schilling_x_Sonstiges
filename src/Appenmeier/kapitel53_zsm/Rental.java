package Appenmeier.kapitel53_zsm;

import java.util.ArrayList;

public class Rental {

    private String name;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    //This braucht man dann wenn man einen Parameter  konsturiert hat der den selben Namen hat, dies wird mit this umgangen
    //thjs kann man vor jedem Attributszugriff schreiben, wäre nur unnötig
    public Rental(String name){
        this.name = name;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void print(){
        System.out.println(name);
        System.out.println();
        System.out.println("Unsere Fahrzeuge: ");
        for(Vehicle v : vehicles){
            v.print(); //Polymorphie - Objekt der Klasse Car

        }
    }

    public void transformAllTrucks(){
        for (Vehicle v: vehicles){
            if(v instanceof Truck){ //auch: if(v instanceof Truck t)
                Truck t = (Truck)v; //könnte dann weggelassen werden
                t.transform();//downcast von Vehicle zu Truck
            }

        }
    }


}
