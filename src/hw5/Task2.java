package hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        // массив четных чисел
        int[] arr = new int [10];
        for (int i = 0, j = 2; i < arr.length; i++, j+=2) {
            arr[i] =  j;
        }
        int[] reverseArr = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            reverseArr[k] = arr[arr.length - 1 - k];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseArr));
    }
}
