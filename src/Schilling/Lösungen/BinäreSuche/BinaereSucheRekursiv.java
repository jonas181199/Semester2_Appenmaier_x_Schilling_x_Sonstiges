package Schilling.Lösungen.BinäreSuche;

import java.util.Arrays;
import java.util.Random;

public class BinaereSucheRekursiv {

    public static int binarySearch(int[] sortedArray, int searchNum){
        int pivotPos = 0;
        int rechteGrenze = sortedArray.length -1;
        int linkeGrenze = 0;
        //solange die rechteGrenze nicht über die linke geht
        while (linkeGrenze <= rechteGrenze){
            pivotPos = (linkeGrenze+rechteGrenze)/2;
            //Vergleiche Pivotelement
            if(sortedArray[pivotPos] == searchNum){
                return pivotPos;
            }
            else{
                //Schaue ob das Pivotelement größer oder kleiner ist
                if (sortedArray[pivotPos] < searchNum){
                    linkeGrenze = pivotPos +1 ;
                }else{
                    rechteGrenze = pivotPos - 1;
                }
            }
        }
        //Wenn das Element nicht gefunden wurde gebe -1 zurück
        return -1;
    }


    public static int binarySearchRecursive(int[] sortedArray, int searchNum, int left, int right) {

        //Bestimmung der Position und des Wertes des Pivotelements
        int pivotPos = (left+right)/2;
        int pivotElem = sortedArray[pivotPos];

        //Breche Suche erfolglos ab, wenn sich die linke und rechte Grenze überkreuzen
        if (right < left) return -1;

        //Breche erfolgreich ab, wenn das gesuchte Element dem Pivotelement entspricht
        if (searchNum == pivotElem) return pivotPos;

        //Setze Suche auf der rechten Teilhälfte fort, wenn gesuchter Wert größer als Pivotelement ist
        if (searchNum > pivotElem) return binarySearchRecursive(sortedArray, searchNum, pivotPos+1, right);

        //Setze Suche auf der linken Teilhälfte fort, wenn gesuchter Wert kleiner als Pivotelement ist
        if (searchNum < pivotElem) return binarySearchRecursive(sortedArray, searchNum, left, pivotPos-1);

        //Erfolglose Rückgabe für Methodensignatur
        return -1;
    }

    public static void main(String[] args) {

        Random generator = new Random();
        // Testarray mit 50 Feldern initialisieren
        int[] sampleNumbers = new int[50];

        // Belegung des Testarray mit Zufallszahlen
        for(int i=0;i<sampleNumbers.length;i++){
            sampleNumbers[i] = generator.nextInt(1000);
        }

        // Testarray sortieren
        Arrays.sort(sampleNumbers);

        // Testarray nach der gesuchten Zahl durchsuchen
        System.out.println(binarySearch(sampleNumbers, sampleNumbers[32]));

        // Testarray nach der gesuchten Zahl durchsuchen
        System.out.println(binarySearchRecursive(sampleNumbers, sampleNumbers[32], 0, sampleNumbers.length));


    }


}

