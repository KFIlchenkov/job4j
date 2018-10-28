package ru.job4j.array;

/**
 * MatrixCheck.
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 28.10.2018.
 */

public class MatrixCheck {
    /**
     * To check ether data diagonal elements the same or not.
     * @param data - input massive
     * @return - result
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (j == data.length - 1 - i) {
                    if (data[i][j] != data[i + 1][j - 1]) {
                        result = false;
                        break;
                    }
                }
                if (i == j) {
                    if (data[i][j] != data[i + 1][j + 1]) {
                        result = false;
                        break;
                    }

                }
            }
        }
        return result;
    }
}
