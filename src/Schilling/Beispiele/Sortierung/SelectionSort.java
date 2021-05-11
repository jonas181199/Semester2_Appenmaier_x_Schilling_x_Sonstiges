package Schilling.Beispiele.Sortierung;

public class SelectionSort {

    public static int[] selectionSort(int[] unsortedArray){
        int temp = 0;
        //Äußere Schleife identifiziert die aktuelle Position im sortierten Bereich
        for(int i = 0; i< unsortedArray.length; i++){
            //Innere Schleife identifiziert das kleinste ELem im unsortierten Bereich
            for(int k = i+1; k< unsortedArray.length;k++){
                if(unsortedArray[i] > unsortedArray[k]){
                    //kleinster Wert abspeichern
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[k];
                    unsortedArray [k] = temp;
                }
            }
        }
        return unsortedArray;
    }

}
