package hw2;

public class Task4 {
    public static void main (String [] args) {
        // задача на псевдослучайные числа (Math.random)
        int i = (int) ((Math.random()*501) + 10);
        if (i > 25 && i < 200) {
            System.out.println("Число " + i + " содержится в интервале (25:200)");
        } else {
            System.out.println("Число " + i + " не содержится в интервале (25:200)");
        }
    }
}
