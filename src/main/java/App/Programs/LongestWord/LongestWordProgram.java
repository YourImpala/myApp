package App.Programs.LongestWord;

import App.Programs.Program;

import java.util.Scanner;

/**
 * @author Dmitriy
 * @see #startProgram(Scanner)
 */
public class LongestWordProgram  extends Program {
    /**
     * start longest word programm
     * @param scanner use to get input from console
     */
    @Override
    public void startProgram(Scanner scanner) {
        System.out.println("Welcome to find longest word programm!");
        System.out.println("Enter the number of words:");
        int length = scanner.nextInt();
        scanner.nextLine();

        LongestWord maxWord = new LongestWord(length);
        maxWord.addWords(scanner);
        System.out.println("The longest word is : " + maxWord.findLongestWord());
    }
}
