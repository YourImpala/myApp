package App;

import java.util.Scanner;

/**
 * @author Dmitriy
 * @see #addWords(Scanner)
 * @see #findLongestWord()
 */
public class LongestWord {
    private final int length;
    private final String[] arr;

    /**
     * init quantity of words and add it to array from console input
     * @param length the length of array, that contains words
     */
    public LongestWord(int length) {
        this.length = length;
        this.arr = new String[length];
    }

    /**
     * add words to array
     * @param scanner use to get input from console
     */
    public void addWords(Scanner scanner) {
        for (int i = 0; i < this.arr.length; i += 1) {
            System.out.println("Enter the word № " + (i+1));
            this.arr[i] = scanner.nextLine();
        }
    }

    /**
     * find the longest word from array
     * @return longest word
     */
    public  String findLongestWord() {
        String longest = this.arr[0];
        for (int i = 1; i < this.arr.length; i++ ) {
            if (this.arr[i].length() > longest.length()) {
                longest = this.arr[i];
            }
        }
        return longest;
    }
}
