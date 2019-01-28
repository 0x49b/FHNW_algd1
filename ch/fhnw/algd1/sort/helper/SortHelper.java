package ch.fhnw.algd1.sort.helper;

import java.util.Random;

public class SortHelper {

    /**
     * Print each element of an array and a newline at the end
     *
     * @param data
     */
    public void printArray(int[] data) {

        for (int i = 0; i < data.length; i++) {

            if (i != data.length - 1) {
                System.out.print(String.format("%d ", data[i]));
            } else {
                System.out.println(String.format("%d ", data[i]));
            }
        }
    }

    /**
     * Array Shuffler
     *
     * @param array
     */
    public int[] shuffleArray(int[] array) {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

        return array;
    }

    /**
     * Create an array of int's with n elements
     * @param digit
     * @return
     */
    public int[] createArray(int digit) {

        int[] hundreds = new int[digit];
        for (int i = 0; i < digit; i++) {
            hundreds[i] = i;
        }
        return hundreds;
    }
}
