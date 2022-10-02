package hw5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*35 + 1);
        int[] initialArray = new int[num];
        for (int i = 0; i < num; i++) {
            initialArray[i] = (int) (Math.random()*100 - 50);
        }
        int negatives = 0;
        for (int j = 0; j < num; j++){
            if (initialArray[j]<0) {
                negatives += 1;
            }
        }
        int[] negativeArray = new int[negatives];
        int newNum = 0;
        for (int j = 0; j < num; j++) {
            if (initialArray[j]<0) {
                negativeArray[newNum] = initialArray[j];
                newNum += 1;
            }
        }
        System.out.println(Arrays.toString(initialArray));
        System.out.println(Arrays.toString(negativeArray));
    }
}
