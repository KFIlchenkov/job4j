package ru.job4j.max;

/**
 * Max
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 15.10.2018.
 */
public class Max {
    /**
     * max
     * @param first - value.
     * @param second - value.
     * @return maximum.
     */

    public int max(int first, int second) {
        return first > second ? first : second;
    }
    public int max(int first, int second, int third) {
        return max(max(first, second), third);

    }

}
