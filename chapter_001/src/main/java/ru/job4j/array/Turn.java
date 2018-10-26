package ru.job4j.array;

/**
 * @author Konstantin Filchenkov (filchenkov86@gmail.com).
 * @version %Id$.
 * @since 25.10.18.
 */

public class Turn {
    /**
     * method to turn massive.
     * @param array - input massive.
     * @return - massive with turned elements.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
