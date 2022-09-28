package hw3;

import java.util.Scanner;

// Алгоритим бинарного поиска
public class Task5 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        while (true) {
          int programGuess = 100;
            System.out.println("Ваше число больше " + programGuess + "?" + '\n' + "1 - ДА, 0 - НЕТ");
            int userAnswer = answer.nextInt();
            if (userAnswer < 0 || userAnswer > 1) {
                System.out.println("1 - ДА, 0 - НЕТ");
                continue;
            } else if (userAnswer == 1) {

            }
        }
    }
}
