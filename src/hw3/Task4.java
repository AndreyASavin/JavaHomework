package hw3;

import java.util.Scanner;

// задача на число от 1 до 9
public class Task4 {
    public static void main(String[] args) {
        int programNum = (int) (Math.random()*9 + 1);
        Scanner userGuess = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число от 1 до 9");
            int userNum = userGuess.nextInt();
            if (userNum < 1 || userNum > 9) {
                System.out.println("В диапазоне от 1 до 9, заново");
                continue;
            }
            if (userNum > programNum) {
                System.out.println("Ваше число больше, попробуйте еще раз");
                continue;
            } else if (userNum < programNum) {
                System.out.println("Ваше число меньше, попробуйте еще раз");
                continue;
            } else {
                System.out.println("Вы угадали");
            }
            break;
        }
    }
}
