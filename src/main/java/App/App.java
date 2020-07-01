package App;

import java.util.Scanner;

/**
 * @author Dmitriy
 *@see #main(String[]) 
 * @see #runCalculator(Scanner) 
 * @see #runLongestWord(Scanner)
 */
public class App {

    /**
     * start the calculator programm
     * @param scanner use to get input from console
     */
    private static void runCalculator(Scanner scanner) {
        System.out.println("Welcome to calculator!");
        System.out.println("First number is: ");
        double a = scanner.nextDouble();
        System.out.println("Second number is: ");
        double b = scanner.nextDouble();
        System.out.println("Operand is: ");
        String operator = scanner.next();
        scanner.close();

        Calculator calculator = new Calculator(a, b);
        switch(operator) {
            case "+":
                System.out.printf("The result is: %.2f", calculator.add());
                break;

            case "-" :
                System.out.printf("%.2f", calculator.sub());
                break;

            case "*":
                System.out.printf("%.2f", calculator.mul());
                break;

            case "/":
                System.out.printf("%.2f", calculator.div());
                break;

            default:
                System.out.println("Wrong operator detected, use +, -, /, *");
        }
    }

    /**
     * start longest word programm
     * @param scanner use to get input from console
     */
    private static void runLongestWord(Scanner scanner) {
        System.out.println("Welcome to find longest word programm!");
        System.out.println("Enter the number of words:");
        int length = scanner.nextInt();
        scanner.nextLine();

        LongestWord maxWord = new LongestWord(length);
        maxWord.addWords(scanner);
        System.out.println("The longest word is : " + maxWord.findLongestWord());

    }

    public static void main(String[] args) {
        System.out.println("1 - Calculator");
        System.out.println("2 - Longest word");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();
        while (option != 1 && option != 2) {
            System.out.println("Enter correct option:");
            option = scanner.nextInt();
        }

        if(option == 1) {
            runCalculator(scanner);
        } else if (option == 2) {
            runLongestWord(scanner);
        }

        scanner.close();
    }


}
