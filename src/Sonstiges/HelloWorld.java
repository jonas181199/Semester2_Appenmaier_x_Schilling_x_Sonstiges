package Sonstiges;

import java.util.Scanner;

public class HelloWorld {

    public static void main (String[] args){
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Gebe eine Zahle ein");
        x = scan.nextInt();

        /*if ( x%2 == 0 && x%3 == 0 && x%5 == 0){
            System.out.println("  - ist gerade");
            System.out.println("  - durch 3 teilbar.");
            System.out.println("  - durch 5 teilbar.");
        }*/
        if (x%2 == 0 && x%3 == 0){
            System.out.println("  - ist gerade");
            System.out.println("  - durch 3 teilbar.");
        }
        else if (x%2 == 0 && x%5 == 0){
            System.out.println("  - ist gerade");
            System.out.println("  - durch 5 teilbar.");
        }
        else if (x%3 == 0 && x%5 == 0){
            System.out.println("  - durch 3 teilbar.");
            System.out.println("  - durch 5 teilbar.");
        }
        else if (x%2 == 0){
            System.out.println(" - ist gerade.");
        }
        else if (x%3 == 0) {
            System.out.println("  - ist durch 3 teilbar.");
        }
        else if (x%5 == 0) {
            System.out.println(" - ist durch 5 teilbar.");
        } else {
            System.out.println("Unbekannt");
        }
    }


}
