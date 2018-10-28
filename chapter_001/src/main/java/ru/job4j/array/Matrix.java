package ru.job4j.array;

/**
 * BubbleSort - сортировка массива.
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 28.10.2018.
 */

public class Matrix {
    /**
     * Method to fill in table
     * @param size - size of table
     * @return - array table
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
