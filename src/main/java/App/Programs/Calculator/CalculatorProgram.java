package App.Programs.Calculator;

import App.Programs.Program;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Callable;

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
    public void startProgram(Scanner scanner) throws Exception {
        System.out.println("Welcome to calculator!");
        System.out.println("First number is: ");
        double a = scanner.nextDouble();
        System.out.println("Second number is: ");
        double b = scanner.nextDouble();
        System.out.println("Operand is: ");
        String operator = scanner.next();
        scanner.close();

        Calculator calculator = new Calculator(a, b);
        Map<String, Callable> operations = Map.of(
                "+", () -> calculator.add(),
                "-", () -> calculator.sub(),
                "*", () -> calculator.mul(),
                "/", () -> calculator.div()
        );
        try {
            System.out.println(operations.get(operator).call());
        } catch (Exception e) {
            System.out.println("Wrong operand. Use : +, -, *, /");
        }

    }

}
