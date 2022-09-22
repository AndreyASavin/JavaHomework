package hw1;

public class Task3 {
    public static void main (String [] args) {
        double hours = 11;
        double kilometers = 245;
        double speedMetreSeconds = kilometers / hours * 1000 / 3600;
        System.out.println("Скорость в м/с " + speedMetreSeconds);
    }
}
