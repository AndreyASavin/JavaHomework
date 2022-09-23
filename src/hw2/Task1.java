package hw2;

public class Task1 {
    public static void main (String [] args) {
        // Задача на if с месяцами
        int month = 10;
        if (month ==1 || month ==2 || month ==12) {
            System.out.println("Сейчас зима");
        } else if (month >=3 && month <=5) {
            System.out.println("Сейчас весна");
        } else if (month >=6 && month <=8) {
            System.out.println("Сейчас лето");
        } else if (month >=9 && month <=11) {
            System.out.println("Сейчас осень");
        } else {
            System.out.println("Введен некорректный номер месяца");
        }
    }
}
