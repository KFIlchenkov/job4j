package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Konstantin Filchenkov (filchenkov86@gmail.com).
 * @version %Id$
 * @since 25.10.18
 */

public class SquareTest {
    /**
     * Test calculate.
     */
    @Test
    public void whenBound3Than149() {
        Square square = new Square();
        int[] rst = square.calculate(3);
        int[] expected = new int[] {1, 4, 9};
        assertThat(rst, is(expected));
    }
    /**
     * Test calculate.
     */
    @Test
    public void whenBound4Than14916() {
        Square square = new Square();
        int[] rst = square.calculate(4);
        int[] expected = new int[] {1, 4, 9, 16};
        assertThat(rst, is(expected));
    }
    /**
     * Test calculate.
     */
    @Test
    public void whenBound5Than1491625() {
        Square square = new Square();
        int[] rst = square.calculate(5);
        int[] expected = new int[] {1, 4, 9, 16, 25};
        assertThat(rst, is(expected));
    }
}
