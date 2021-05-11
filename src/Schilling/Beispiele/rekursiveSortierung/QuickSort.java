package Schilling.Beispiele.rekursiveSortierung;

public class QuickSort {

    public static void quickSort(int[] unsorted, int linkeGrenze, int rechteGrenze){
        int l, r, pivot;
        //Bearbeite den Array nur wenn mehr als ein Element zwischen linker und der rechten Grenze liegt
        if(linkeGrenze < rechteGrenze){
            //Pivotelement, egal wo bestimmt aber immer konsistent auf selbe Weise durchziehen
            pivot = unsorted[rechteGrenze];
            l = linkeGrenze;
            r = rechteGrenze-1;
            do{
                //geht die linke Seite durch und bricht ab sobald ein Element größer als das pivotElem ist
                //unsorted [l] darf nicht größer als Pivot
                while(unsorted[l] < pivot && l < rechteGrenze){
                    l++;
                }
                //geht rechte Seite durch und bricht ab sobald ein Element kleiner als das pivotElem ist
                //Abbruch wenn rechtes Element kleiner als Pivot
                while (unsorted[r] > pivot && r > linkeGrenze){
                    r--;
                }
                //Vertausche die Position der Elemente
                if (l<r){
                    /*Swap operation --> solang bis auf linker Seite nur noch kleiner Elemente als pivot
                    und rechte Seite nur noch größere Elemente*/
                    vertausche(unsorted, l, r);
                }
            } while (l<r);
            //Pivotelem an die richtige Position
            vertausche(unsorted, l, rechteGrenze);
            //Wende Quicksort auf linken und rechten Teil an
            quickSort(unsorted, linkeGrenze, l-1);
            quickSort(unsorted, l+1, rechteGrenze);
        }
    }

    private static void vertausche(int[] unsorted, int l, int r) {
    }

}
