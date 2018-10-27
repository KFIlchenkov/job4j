package ru.job4j.array;

/**
 * @author Konstantin Filchenkov (filchenkov86@gmail.com).
 * @version %Id$
 * @since 25.10.18
 */

public class Check {
    /**
     * method to check massive with the same value.
     * @param data - input massive.
     * @return - check result.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean name: data) {
            if (data[0] != name) {
                result = false;
                break;
            }
        }
        return result;
    }
}
