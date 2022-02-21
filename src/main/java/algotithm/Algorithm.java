package algotithm;

import java.util.Arrays;

public class Algorithm {

    public int[] simpleCountingSort(int[] sourceArray) {
        if (checkSourceArray(sourceArray)) return simpleCountingSortAlgorithm(sourceArray);
        else throw new IllegalArgumentException();
    }

    public int[] simpleCountingSortAlgorithm(int[] sourceArray) {
        int[] zerosArray;
        int[] resultArray = new int[sourceArray.length];

        zerosArray = countValues(sourceArray);
        int idx = 0;

        for (int i = 0; i < zerosArray.length; i++) {
            for (int j = 0; j < zerosArray[i]; j++) {
                resultArray[idx++] = i;
            }
        }
        return resultArray;
    }

    public boolean checkSourceArray(int[] sourceArray){
        for (int element: sourceArray){
            if (element < 0 || element > 1000) return false;
        }
        return true;
    }

    public int[] countValues(int[] sourceArray) {
        int[] zerosArray = new int[Arrays.stream(sourceArray).max().getAsInt() + 1];
        Arrays.fill(zerosArray, 0);
        for (Integer integer : sourceArray) {
            zerosArray[integer]++;
        }
        return zerosArray;
    }
}
