package ru.job4j.array;

/**
 * ArrayChar - обертка над стракой.
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 13.10.2018.
 */

public class ArrayChar {
    private char[] data;
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * startWith - to check word start with prefix
     * @param prefix - prefix
     * @return - if world start with prefix.
     */
    public boolean startWith(String prefix) {
       boolean result = true;
       char[] value = prefix.toCharArray();
       for (int i = 0; i < value.length; i++) {
           if (value[i] != data[i]) {
               result = false;
               break;
           }
       }
       return result;
    }
}
