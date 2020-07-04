package App.Programs.Calculator;

import App.Programs.Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Dmitriy
 * @see #startProgram(Scanner)
 */
public class CalculatorProgram extends Program {

    /**
     * start the calculator programm
     * @param scanner use to get input from console
     */
    @Override
    public void startProgram(Scanner scanner) {
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

}
