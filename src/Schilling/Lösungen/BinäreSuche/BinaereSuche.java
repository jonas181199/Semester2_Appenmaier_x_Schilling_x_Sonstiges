package Schilling.Lösungen.BinäreSuche;

import java.util.Arrays;
import java.util.Random;

public class BinaereSuche {

    public static int binarySearch(int[] sortedArray, int searchNum) {
        int pivotPos = 0;
        int rechteGrenze = sortedArray.length - 1;
        int linkeGrenze = 0;
        //solange die rechteGrenze nicht über die linke geht
        while (linkeGrenze <= rechteGrenze) {
            pivotPos = (linkeGrenze + rechteGrenze) / 2;
            //Vergleiche Pivotelement
            if (sortedArray[pivotPos] == searchNum) {
                return pivotPos;
            } else {
                //Schaue ob das Pivotelement größer oder kleiner ist
                if (sortedArray[pivotPos] < searchNum) {
                    linkeGrenze = pivotPos + 1;
                } else {
                    rechteGrenze = pivotPos - 1;
                }
            }
        }
        //Wenn das Element nicht gefunden wurde gebe -1 zurück
        return -1;
    }


    // Erweitern Sie diese Klasse um eine rekursive Implementierung der Binärsuche und testen Sie diese


    public static void main(String[] args) {

        Random generator = new Random();
        // Testarray mit 50 Feldern initialisieren
        int[] sampleNumbers = new int[50];

        // Belegung des Testarray mit Zufallszahlen
        for (int i = 0; i < sampleNumbers.length; i++) {
            sampleNumbers[i] = generator.nextInt(1000);
        }

        // Testarray sortieren
        Arrays.sort(sampleNumbers);

        // Testarray nach der gesuchten Zahl durchsuchen
        System.out.println(binarySearch(sampleNumbers, sampleNumbers[32]));
    }


}

