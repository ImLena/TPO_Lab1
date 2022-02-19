package algotithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Algorithm {

    public Integer[] simpleCountingSort(ArrayList<Integer> sourceArray){
        Integer[] zerosArray = new Integer[Collections.max(sourceArray)+1];
        Integer[] resultArray = new Integer[sourceArray.size()];

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
