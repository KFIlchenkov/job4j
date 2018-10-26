package ru.job4j.array;

/**
 * @author Konstantin Filchenkov (filchenkov86@gmail.com).
 * @version %Id$
 * @since 25.10.18
 */

public class Square {
    /**
     * method for fill in massive with
     * @param bound - massive length.
     * @return - massive.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}
