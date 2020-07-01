package MaxMinNumber;

public class Main {
    public static void main(String[] args) {
        MaxMinNumber maxMinNumber = new MaxMinNumber();
        maxMinNumber.fillArray();
        maxMinNumber.printArray();
        System.out.println("The max negative number is: " + maxMinNumber.findMaxNegativeNumber());
        System.out.println("The min positive number is : " + maxMinNumber.findMinPositiveNumber());
    }
}
