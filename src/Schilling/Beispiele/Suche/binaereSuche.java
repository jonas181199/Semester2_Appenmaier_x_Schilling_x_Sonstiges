package Schilling.Beispiele.Suche;

public class binaereSuche {

    public static int binaereSuche(int[] sortedArray, int searchnum){
        int pivotPos = 0;
        int rechteGrenze = sortedArray.length-1;
        int linkeGrenze = 0;
        //solange die rechteGrenze nicht über die linke geht
        while(linkeGrenze <= rechteGrenze){
            pivotPos = (linkeGrenze+rechteGrenze)/2;
            //Vergleiche Pivotelement
            if(sortedArray[pivotPos] == searchnum){
                return pivotPos;
            }else{
                //Schaue ob das Pivotelement größer oder kleiner ist
                if(sortedArray[pivotPos] < searchnum){
                    linkeGrenze = pivotPos + 1;
                }else{
                    rechteGrenze = pivotPos - 1;
                }
            }
        }
        //Wenn das Element nicht gefunden wurde gebe -1 zurück
        return -1;
    }

}
