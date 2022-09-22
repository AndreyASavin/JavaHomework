package hw1;

public class Task2 {
    public static void main (String [] args) {
        int number = 42;
        long cubicNum = number * number * number;
        double mathCubicNum = Math.pow(number, 3);
        System.out.println("Степень 3 умножением " + cubicNum);
        System.out.println("Степень 3 через Math.pow " + mathCubicNum);
    }
}
