package hw5;

public class Task4 {
    public static void main(String[] args) {
        // поиск наибольшего слова
        String sentence = "в предложении все слова разной длины";
        String[] arr = sentence.split(" ");
        int lettersCount = 0;
        int longestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            String[] word = arr[i].split("");
            if (word.length > lettersCount) {
                lettersCount = word.length;
                longestIndex = i;
            }
        }
        System.out.println(arr[longestIndex]);
    }
}
