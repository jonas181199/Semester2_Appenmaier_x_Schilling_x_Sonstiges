package Schilling.Beispiele;

public class konstantesWachstum {

    private int constantRunTime(int[] array) {
        int result = array[0] + array[1];
        return result;
    }

    private int linearRunTime(int[] array) {
        int compareTo = 3;
        int matches = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == compareTo) {
                matches = matches + 1;
            }
        }
        return matches;
    }

    private int[] quadraticRunTime(int[] array) {
        int[] matches = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            for (int k = 0; k < array.length - 1; k++) {
                if (array[i] == array[k]) {
                    //matches [i] == matches[i] + 1;
                }
            }
        }
        return matches;
    }

    private int logarithmicRunTime(int[] array) {
        int count = 0;
        for (int i = 2; i < array.length; i = i * 2) {
            count = count + array[i];
        }
        return count;
    }

}
