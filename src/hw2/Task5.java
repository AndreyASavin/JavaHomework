package hw2;

public class Task5 {
    public static void main(String [] args) {
        // Задача на вложенный if (возраст и опыт)
        // P.S. добавил несколько доп условий
        int age = 27, exp = 2;
        if (age < 0 || age > 100) {
            System.out.println("Введите корректный возраст");
        } else if ((age >=0 && age < 18) || (age >=65 && age <=100)) {
            System.out.println("Мы вам перезвоним");
        } else {
            if (exp < 0 || exp >= age) {
                System.out.println("Введите корректный опыт работы");
            } else if (exp >= 0 && exp <= 5) {
                System.out.println("Вы подходите на должность стажера");
            } else {
                System.out.println("Вы подходите на роль разработчика");
            }
        }
    }
}
