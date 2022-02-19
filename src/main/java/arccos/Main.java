package arccos;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num = readValue();
        Arccos st = new Arccos();
        System.out.printf("arccos(%2.2f) = ", num);
        System.out.print(st.arccos(num));
    }

    private static double readValue(){
        double num = 0.0;
        try {
            System.out.println("Введите число в диапазоне [-1, 1]:");
            num = Double.parseDouble(new Scanner(System.in).nextLine());
        } catch (NumberFormatException | NoSuchElementException e) {
            System.out.println("Ожидалось число");
            System.exit(0);
        }
        return num;
    }
}
