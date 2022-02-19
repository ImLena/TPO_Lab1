package algotithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Algorithm {

    public int[] simpleCountingSort(int[] sourceArray){
        int[] zerosArray = new int[Arrays.stream(sourceArray).max().getAsInt()+1];
        int[] resultArray = new int[sourceArray.length];

        Arrays.fill(zerosArray, 0);

        for (Integer integer : sourceArray) {
            zerosArray[integer]++;
        }

        int idx = 0;

        for (int i = 0; i < zerosArray.length; i++) {
            for (int j = 0; j < zerosArray[i]; j++) {
                resultArray[idx++] = i;
            }
        }

        return resultArray;

    }
}
