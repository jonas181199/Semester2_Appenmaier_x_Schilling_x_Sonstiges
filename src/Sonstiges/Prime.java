package Sonstiges;

public class Prime {
    public static void main(String[] args) {

        //istPrim(4);

    }


    public static void istPrim(int n) {
        boolean primZahl = true;  //... solange wir keinen Teiler gefunden haben
        int moeglicherTeiler = 2;
        for(int i = 0; moeglicherTeiler < n; i++) { //Teiler muss kleiner sein als Zahl selbst
            if (n % moeglicherTeiler == 0) { //Teiler gefunden -> keine Primzahl
                System.out.println(n + " ist keine Primzahl.");
            } else {
                moeglicherTeiler = moeglicherTeiler + 1;  //Teiler hochzählen
                System.out.println(n + " ist eine Primzahl.");
                break;
            }
        }
    }
}