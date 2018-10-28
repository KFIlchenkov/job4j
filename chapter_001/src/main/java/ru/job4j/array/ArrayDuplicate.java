package ru.job4j.array;

/**
 * ArrayDublicate - to find out the same elements of array.
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 28.10.2018.
 */

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int b = 1; b < array.length;) {
                if (b > i) {
                    if (array[i].equals(array[i + 1])) {
                        int c = 0;
                        c++;
                    }

                }
            }
        }
        return array;
    }

}
