package ru.job4j.array;

/**
 * BubbleSort - сортировка массива.
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 28.10.2018.
 */

public class BubbleSort {

    /**
     * Method sort to sort arrays.
     * @param array - input array.
     * @return array - sorted array.
     */
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
           for (int b = 0; b < array.length - 1 - i; b++) {
               if (array[b] > array[b + 1]) {
                   int temp = array[b + 1];
                   array[b + 1] = array[b];
                   array[b] = temp;
               }
           }
        }
        return array;
    }
}
