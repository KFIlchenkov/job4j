package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * BubbleSortTest - to sort input massive array.
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 28.10.2018.
 */

public class BubbleSortTest {

    /**
     * Test sort.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
       BubbleSort sort = new BubbleSort();
       int[] inputarray = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
       int[] result = sort.sort(inputarray);
       int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
       assertThat(result, is(expected));
    }
}
