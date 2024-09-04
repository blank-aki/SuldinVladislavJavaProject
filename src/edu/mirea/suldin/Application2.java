package edu.mirea.suldin;

import java.util.Random;
import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numberArray1 = new int[10];
        int[] numberArray2 = new int[10];
        for (int i = 0; i < numberArray1.length; i++) {
            numberArray1[i] = random.nextInt(-100,100);
        }
        for (int i = 0; i < numberArray2.length; i++) {
            numberArray2[i] = random.nextInt(-100,100);
        }
        System.out.println("Первый массив: " + Arrays.toString(numberArray1));
        System.out.println("Второй массив: " + Arrays.toString(numberArray2));
        System.out.print("Общие значения: ");
        findCommonValues(numberArray1, numberArray2);
    }
    public static void findCommonValues(int[] numberArray1, int[] numberArray2) {
        Arrays.sort(numberArray1);
        Arrays.sort(numberArray2);
        int i = 0;
        int j = 0;
        while (i < numberArray1.length && j < numberArray2.length) {
            if (numberArray1[i] == numberArray2[j]) {
                System.out.print(numberArray1[i] + " ");
                i++;
                j++;
            } else if (numberArray1[i] < numberArray2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println();
    }
}
