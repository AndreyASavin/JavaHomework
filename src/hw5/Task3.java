package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // массив из N слов
        int n = (int) (Math.random()*7 + 1);
        String[] stringArr = new String[n];
        Scanner word = new Scanner(System.in);
        int counter = 0;
        while (true) {
            if (stringArr[n-1] == null) {
                System.out.println("Введите слово, exit - для выхода");
                String userWord = word.nextLine();
                boolean hasWord = Arrays.asList(stringArr).contains(userWord);
                if (userWord.equals("exit")) {
                    System.out.println("Массив слов:");
                    System.out.println(Arrays.toString(stringArr));
                    break;
                } else {
                    if (hasWord == true) {
                        System.out.println("Такое слово уже есть");
                        continue;
                    } else {
                        stringArr[counter] = userWord;
                        counter += 1;
                    }
                }
            } else {
                System.out.println("Массив заполнен");
                System.out.println(Arrays.toString(stringArr));
                break;
            }
        }
    }
}
