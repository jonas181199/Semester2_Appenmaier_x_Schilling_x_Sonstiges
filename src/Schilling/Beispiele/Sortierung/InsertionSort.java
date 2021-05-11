package Schilling.Beispiele.Sortierung;

public class InsertionSort {

    public static int[] insertionSort(int[] unsortedArray){
        int temp = 0;
        //Äußere Schleife wählt das nächste zu vergleichende Element aus
        for(int i = 0; i < unsortedArray.length; i++){
            temp = unsortedArray[i];
            int k = i;
            //Innere Schleife identifiziert die korrekte Pos im sortierten Bereich
            //Wenn gleich dann in while Schleife
            //bricht ab sobald links kleiner als rechts
            //Karte an Pos bringen
            while (k > 0 && unsortedArray[k-1] > temp){
                unsortedArray[k] = unsortedArray[k - 1];
                k--;
            }
            unsortedArray[k] = temp;
        }
        return unsortedArray;
    }
}
