package hw2;

public class Task2 {
    public static void main (String [] args) {
        // задача на switch с купонами
        double sum = 60000;
        int saleCode = 764;
        switch (saleCode) {
            case (4525): {
                System.out.println("Со скидкой 30% " + sum * 0.7);
                break;
            }
            case (6424):
            case (7012): {
                System.out.println("Со скидкой 20% " + sum * 0.8);
                break;
            }
            case (7647):
            case (9011):
            case (6612): {
                System.out.println("Со скидкой 10% " + sum * 0.9);
                break;
            }
            default: {
                System.out.println("Без скидки " + sum);
                break;
            }
        }
    }
}
