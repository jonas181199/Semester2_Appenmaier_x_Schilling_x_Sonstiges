package Schilling.Beispiele.rekursiveSortierung;

public class MergeSort {

    public static void mergeSort(int[] unsortiert, int linkeGrenze, int rechteGrenze){
        int i, j, k, mitte;
        int[] tmp = new int [unsortiert.length];
        //Wenn mehr als ein Element eingrenzt
        if (rechteGrenze>linkeGrenze){
            mitte = (linkeGrenze + rechteGrenze)/2;
            mergeSort(unsortiert, linkeGrenze, mitte);
            mergeSort(unsortiert,mitte + 1, rechteGrenze);
            //alle Werte ins Feld b kopieren
            // b = a [l],..., a[m], a[r],...,a[n+1]
            for(i = mitte; i >= linkeGrenze; i--){
                tmp[i] = unsortiert[i];
            }
            for(j = mitte; j <= rechteGrenze; j++){
                tmp[rechteGrenze + mitte + 1 - j] = unsortiert[j];
            }
            //Dann die größten Elemente der Teilliste absteigend miteinander vergleichen
            i = linkeGrenze;
            j = rechteGrenze;
            for(k=linkeGrenze; k <= rechteGrenze; k++){
                if(tmp[i] < tmp[j]){
                    unsortiert[k] = tmp[i++];
                }else {
                    unsortiert[k]=tmp[j--];
                }
            }
        }
    }



}
