package MaxMinNumber;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Dmitriy
 * @see #fillArray()
 * @see #printArray()
 * @see #findMaxNegativeNumber()
 * @see #findMinPositiveNumber()
 */
public class MaxMinNumber {

    private final int[] arr;
    private final int MIN = -10;
    private final int MAX = 10;

    /**
     * init empty array
     */
    public MaxMinNumber() {
        this.arr = new int[20];
    }

    /**
     * Create random number from range
     * @param minRange min range of numbers
     * @param maxRange max range of numbers
     * @return int number from minRange to maxRange
     */
    private int randomInt(int minRange, int maxRange) {
        Random random = new Random();

        return  random.nextInt(maxRange - minRange) + minRange;
    }

    /**
     * Fill the array by random int numbers
     */
    public void fillArray() {

        for (int i = 0; i < this.arr.length; i += 1) {
            this.arr[i] = randomInt(MIN, MAX);
        }
    }

    /**
     * print array to console
     */
    public void printArray() {
        System.out.println(Arrays.toString(this.arr));
    }

    /**
     * find the max negative number from array
     * @return max negative number from array
     */
    public  int findMaxNegativeNumber() {
        int max = MIN;
        for (int i = 0; i < this.arr.length; i += 1) {
            if (this.arr[i] < 0 && this.arr[i] > max) {
                max = this.arr[i];
            }
        }
        return max;
    }

    /**
     * find the min positive number from array
     * @return min positive number from array
     */
    public int findMinPositiveNumber() {
        int min = MAX;
        for (int i = 0; i < this.arr.length; i += 1) {
            if (this.arr[i] > 0 && this.arr[i] < min) {
                min = this.arr[i];
            }
        }
        return min;
    }
}
