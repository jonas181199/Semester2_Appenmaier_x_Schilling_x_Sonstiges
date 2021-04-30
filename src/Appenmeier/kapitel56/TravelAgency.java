package Appenmeier.kapitel56;

import java.util.ArrayList;

public class TravelAgency implements Partner {

    private String name;
    ArrayList<Partner> partners = new ArrayList<>();

    public TravelAgency(String name) {

        this.name = name;
    }

    public void addPartner(Partner partner) {
        partners.add(partner);
    }


    @Override
    public void print() {
        System.out.println(name);
        System.out.println();
        System.out.println("Unsere Partner: ");
        for (Partner partner : partners) {
            partner.print();
        }

    }
}


