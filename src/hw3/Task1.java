package hw3;

public class Task1 {
    public static void main(String[] args) {
        // 1)
        for (int i=90; i >= 0; i -= 5){
            System.out.print(i + ", ");
        }
        System.out.println(" ");
        // 2)
        int j = 2;
        for (int k = 1; k <= 10; k++) {
            System.out.print(j + ", ");
            j += 2;
        }
    }
}
