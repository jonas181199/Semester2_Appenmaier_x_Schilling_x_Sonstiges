package Schilling.Beispiele.Sortierung;

public class BubbleSort {

    public static void bubbleSort(int[]array){
        int n = array.length;
        int temp = 0;
        //Äußere Schleife für einzelne Durchläufe
        for(int i = 0; i < n - 1; i++){
            //Innere Schleife für die paarweisen Vergleiche pro Durchlauf
            for(int k = 0; k < n - i - 1; k++){
                if(array[k] > array[k + 1]){
                    //Swap elements
                    temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1]= temp;
                }
            }
        }
    }


}
