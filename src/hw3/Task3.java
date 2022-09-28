package hw3;

import java.util.Scanner;
// Задача на тарелки и мыло
public class Task3 {
    public static void main(String[] args) {
        Scanner soap = new Scanner(System.in);
        Scanner plates = new Scanner(System.in);
        while (true) {
            System.out.println("Введите кол-во моющего средства");
            double userSoap = soap.nextDouble();
            if (userSoap <= 0) {
                System.out.println("Кол-во моющего средства должно быть положительным");
                continue;
            }
            System.out.println("Введите кол-во тарелок");
            int userPlates = plates.nextInt();
            if (userPlates <= 0) {
                System.out.println("Кол-во тарелок должно быть положительным");
                continue;
            }
            while (userSoap > 0 && userPlates > 0) {
                System.out.println("Мыла осталось " + userSoap + ", Тарелок осталось " + userPlates);
                userSoap -= 0.5;
                userPlates -= 1;
            }
            System.out.println("Осталось " + userSoap + " мыла и " + userPlates + " тарелок");
            break;
        }
    }
}

