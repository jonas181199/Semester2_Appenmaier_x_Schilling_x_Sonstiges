package Appenmeier.kapitel56_zsm;

import java.util.ArrayList;

public class TravelAgency {

    private String name;
    private ArrayList<Partner> partners = new ArrayList<>();

    public TravelAgency (String name){
        this.name = name;

    }

    public void addPartner(Partner partner){
        partners.add(partner);
    }

    public void print(){
        System.out.println(name);
        System.out.println();
        System.out.println("Unsere Partner: ");
        for (Partner p :partners){
            p.print(); // Polymorphie
        }
    }
}
