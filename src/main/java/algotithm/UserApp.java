package algotithm;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserApp {
    Algorithm algorithm = new Algorithm();

    public void userApp() {
        int[] sourceArray = readSize();

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(algorithm.simpleCountingSort(sourceArray)));
    }

    private int[] readSize(){
        int size = 0;
        try {
            System.out.println("Введите число элементов массива:");
            size = Integer.parseInt(new Scanner(System.in).nextLine());//in.nextInt();
        } catch (NumberFormatException | NoSuchElementException e) {
            System.out.println("Ожидалось число");
            readSize();
            System.exit(0);
        }
        return readArray(size);
    }

    private int[] readArray(int size){
        int[] sourceArray = new int[size];
        System.out.println("Введите элементы массива через пробел:");
        try(Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < size; i++) {
                sourceArray[i] = in.nextInt();
            }
        } catch (NoSuchElementException e){
            System.out.println("Ожидалось число");
            readArray(size);
            System.exit(0);
        }
        return sourceArray;
    }


}
