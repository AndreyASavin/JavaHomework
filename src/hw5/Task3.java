package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // массив из N слов
        int n = (int) (Math.random()*7 + 1);
        String[] stringArr = new String[n];
        Scanner word = new Scanner(System.in);
//        int counter = 0;
        while (stringArr[n-1]==null) {
            System.out.println("Введите слово, exit - для выхода");
            String userWord = word.nextLine();
            if (userWord.equals("exit")) {
                System.out.println("Ваш массив");
                System.out.println(Arrays.toString(stringArr));
                break;
            } else {
                for (int i = 0; i < stringArr.length; i++) {
                    if (stringArr[i].equals(userWord)) {
                        System.out.println("Такое слово уже есть");
                        break;
                    } else if (stringArr[i]==null) {
                        stringArr[i] = userWord;
                        break;
                    }
                }
            }
        }
        System.out.println("Массив полон");
        System.out.println(Arrays.toString(stringArr));
    }
}
