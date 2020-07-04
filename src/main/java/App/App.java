package App;

import java.util.InputMismatchException;
import java.util.Scanner;
import App.Programs.Calculator.CalculatorProgram;
import App.Programs.LongestWord.LongestWordProgram;
/**
 * @author Dmitriy
 *@see #main(String[])
 */
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("1 - Calculator");
        System.out.println("2 - Longest word");

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        try {
            option = scanner.nextInt();
            while (option != 1 && option != 2) {
                System.out.println("Enter correct option:");
                option = scanner.nextInt();
            }
        } catch (InputMismatchException e ) {
            System.out.println(e);
            System.out.println("Wrong parametr. Use only digits");
        }
        

        if (option == 1) {
            CalculatorProgram calculatorProgramm = new CalculatorProgram();
            calculatorProgramm.startProgram(scanner);
        } else if (option == 2) {
            LongestWordProgram longestWordProgramm = new LongestWordProgram();
            longestWordProgramm.startProgram(scanner);
        }

        scanner.close();
    }
}
