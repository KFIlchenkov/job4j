package ru.job4j.array;

/**
 * @author Konstantin Filchenkov (filchenkov86@gmail.com).
 * @version %Id$
 * @since 25.10.18
 */

public class FindLoop {
    /**
     *
     * @param data - massive.
     * @param el - element to find out.
     * @return - index.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
