package hw1;

public class Task4 {
    public static void main (String [] args) {
        //        float a = 45.6; // оптимизирован на double
        long b = 60000;
//        long c = a / b; // сам не приведет к типу long, так как float

        int x = 34;
        long y = 78;
//        int z = x / y; // сам не приведет к int, так как long

        double n = 90.8;
        double m = -100.1;
//        int max = n > m ? n : m; // сам не приведет к int, так double

        byte code = 1;
//        boolean isActive = (boolean) code; // число не приводится к boolean
    }
}
