package MaxMinNumber;


import java.util.Arrays;
import java.util.Random;

/**
 * @author Dmitriy
 * @see #fillArray()
 * @see #printArray()
 * @see #findMaxNegativeNumber()
 * @see #findMinPositiveNumber()
 * @see #indexOf(int[], int)
 * @see #swap(int, int)
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
     *find index of array element
     * @param arr array where want to find index
     * @param search search element
     * @return index of search element if found, if not found return -1
     */
    private int indexOf(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
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

    /**
     * swap two elements and return swaped array(copy of origin)
     * @param a first element
     * @param b second element
     * @return new swaped array
     */
    public int[] swap(int a, int b) {
        
        int[] copy = this.arr.clone();
        int indexA = indexOf(copy, a);
        int indexB = indexOf(copy, b);


        int tmp = copy[indexA];
        copy[indexA] = copy[indexB];
        copy[indexB] = tmp;

        return copy;
    }
}
