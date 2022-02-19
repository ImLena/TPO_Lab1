package algotithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserApp {
    Scanner in = new Scanner(System.in);
   // ArrayList<Integer> sourceArray = new ArrayList<>();
    Algorithm algorithm = new Algorithm();

    public void userApp(){
        System.out.println("Введите число элементов массива:");
        int size = in.nextInt();
        int[] sourceArray = new int[size];
        System.out.println("Введите элементы массива через пробел:");
        for (int i = 0; i < size; i++) {
            sourceArray[i] = in.nextInt();
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(algorithm.simpleCountingSort(sourceArray)));
    }
}
