import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
                System.out.printf("%.2f", calculator.add());
                break;

            case "-" :
                System.out.printf("%.2f", calculator.sub());
                break;
                
            case "*":
                System.out.printf("%.2f", calculator.mul());;
                break;
                
            case "/":
                System.out.printf("%.2f", calculator.div());
                break;
                
            default:
                 System.out.println("Wrong operator detected, use +, -, /, *");    
        }
    }
}
