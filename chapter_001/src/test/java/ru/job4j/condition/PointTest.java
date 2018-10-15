package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test point.
 * @author Konstatin Filchenkov.
 * @version $Id$.
 * @since 15.10.2018.
 */

public class PointTest {
    /**
     * Test distanceTo;
     */
    @Test
    public void distanseToTest() {
        Point a = new Point(0, 5);
        Point b = new Point(2, 5);
        double result = a.distanceTo(b);
        assertThat(result, is(2D));
    }
}
