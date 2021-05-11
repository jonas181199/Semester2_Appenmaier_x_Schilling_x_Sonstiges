package Schilling.Beispiele.Suche;

public class lineareSuche{

    public static int lineareSuche(int[] sortedArray, int searchnum){
        for(int i = 0; i < sortedArray.length; i++){
            //Vergleiche jedes Element im Array mit dem Suchwert
            if(sortedArray[i] == searchnum){
                return i;
            }
            //Breche Suche ab, wenn aktueller Wert größer als Suche ist
            if(sortedArray[i] > searchnum){
                return -1;
            }
        }
        //Wenn das Element nicht gefunden wurde gebe -1 zurück
        return -1;
    }




}
