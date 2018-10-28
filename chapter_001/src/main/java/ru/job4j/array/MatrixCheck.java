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
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i] || data[0][data.length - 1] != data[i][data.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

