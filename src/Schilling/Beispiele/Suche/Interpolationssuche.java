package Schilling.Beispiele.Suche;

public class Interpolationssuche {

    public static int interpolationssuche(int[] sortedArray, int searchnum) {
        int pivotPos = 0;
        int rechteGrenze = sortedArray.length - 1;
        int linkeGrenze = 0;
        //solange die rechteGrenze nicht über die linke geht
        while (linkeGrenze <= rechteGrenze) {
            //Berechnung der pivotPos
            pivotPos = linkeGrenze + (searchnum - sortedArray[linkeGrenze]) /
                    (sortedArray[rechteGrenze] - sortedArray[linkeGrenze]) +
                    (rechteGrenze - linkeGrenze);
            //Vergleiche pivotPos
            if (sortedArray[pivotPos] == searchnum) {
                return pivotPos;
            } else {
                //SChaue ob pivotPos größer oder kleiner
                if (sortedArray[pivotPos] < searchnum) {
                    linkeGrenze = pivotPos + 1;
                } else {
                    rechteGrenze = pivotPos - 1;
                }
            }
        }
        //Wenn Element nicht gefunden werden konnte
        return -1;


    }
}

