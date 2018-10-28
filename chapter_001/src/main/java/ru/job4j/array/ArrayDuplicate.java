package ru.job4j.array;

import java.util.Arrays;

/**
 * ArrayDublicate - to find out the same elements of array.
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 28.10.2018.
 */

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int b = array.length - 1; b > i; b--) {
                if (array[i].equals(array[b])) {
                    array[b] = "find" + count;
                    String temp = array[array.length - 1 - count];
                    array[array.length - 1 - count] = array[b];
                    array[b] = temp;
                    count++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - count);
    }

}


