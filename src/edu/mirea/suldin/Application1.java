package edu.mirea.suldin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        int[] numberArray;
        int arrayLenght;
        int numToFind = 0;

        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        arrayLenght = scan.nextInt();

        numberArray = new int[arrayLenght];
        Random random = new Random();
        for(int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(-100, 100);
        }

        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));

        MyMethod(numToFind, scan, numberArray);
    }

    private static void MyMethod(int numToFind, Scanner scan, int[] numberArray) {
        System.out.println("Введите число для поиска:");

        numToFind = scan.nextInt();

        int low = 0;

        int high = numberArray.length;

        int middle;
        int k = 0;

        while(low <= high) {
            k = k+1;
            System.out.println(k);
            middle = (low + high) / 2;

            int num = numberArray[middle];

            if(num == numToFind){
                System.out.println("Значение найдено под индексом "+middle);
                return;
            } else if(num > numToFind){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        System.out.println("Искомого значения в массиве нет");
    }
}