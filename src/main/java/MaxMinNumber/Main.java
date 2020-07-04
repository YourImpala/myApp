package MaxMinNumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MaxMinNumber maxMinNumber = new MaxMinNumber();
        maxMinNumber.fillArray();
        maxMinNumber.printArray();
        int maxNegativeNumber = maxMinNumber.findMaxNegativeNumber();
        int minPositiveNumber = maxMinNumber.findMinPositiveNumber();
        System.out.println("The max negative number is: " + maxNegativeNumber);
        System.out.println("The min positive number is : " + minPositiveNumber);

        int[] swaped = maxMinNumber.swap(maxNegativeNumber, minPositiveNumber);
        System.out.println("Swaped array:");
        System.out.println(Arrays.toString(swaped));
    }
}
