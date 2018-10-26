package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Konstantin Filchenkov (filchenkov86@gmail.com).
 * @version %Id$
 * @since 25.10.18
 */

public class FindLoopTest {
    /**
     *Test indexOf.
     */
    @Test
    public void whenArraysHasLengthFiveThanZero() {
        FindLoop find = new FindLoop();
        int value = 5;
        int[] input = new int[] {5, 10, 3};
        int result = find.indexOf(input, value);
        int expected = 0;
        assertThat(result, is(expected));
    }

    /**
     *Test indexOf.
     */
    @Test
    public void whenArraysHasLengthSixThanNull() {
        FindLoop find = new FindLoop();
        int value = 6;
        int[] input = new int[] {5, 10, 3};
        int result = find.indexOf(input, value);
        int expected = -1;
        assertThat(result, is(expected));
    }
}
