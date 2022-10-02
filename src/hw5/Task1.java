package hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // массив N случайных целых чисел
        int n = (int) (Math.random()*5+1);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random()*200);
        }
        System.out.println("Весь массив: " + Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        for (int i : array) {
            sum += i;
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Среднее арифметическое: " + (double) (sum / array.length));
    }
}
