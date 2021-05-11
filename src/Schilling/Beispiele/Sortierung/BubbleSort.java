package Schilling.Beispiele.Sortierung;

public class BubbleSort {

    public static void bubbleSort(int[]array){
        int n = array.length;
        int temp = 0;
        //Äußere Schleife für einzelne Durchläufe
        for(int i = 0; i < n - 1; i++){
            //Innere Schleife für die paarweisen Vergleiche pro Durchlauf
            for(int k = 0; k < n - i - 1; k++){
                //k: linker Index der Gabel & k+1: rechter Index der Gabel
                if(array[k] > array[k + 1]){
                    //Swap elements
                    temp = array[k]; //in Zwischenvariable
                    array[k] = array[k + 1]; //überführen
                    array[k + 1]= temp; //rechten Wert belegen
                }
            }
        }
    }


}
