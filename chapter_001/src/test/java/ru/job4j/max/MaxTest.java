package ru.job4j.max;
import org.junit.Test;
import ru.job4j.max.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TestMax
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * since 15.10.2018.
 */

public class MaxTest {
    /**
     * Test max
     */
    @Test
    public void whenOneTwoThanTwo() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
    /**
     * Test max
     */
    @Test
    public void whenOneTwoTreeThanThree() {
        Max max = new Max();
        int result = max.max(156, 22, 3);
        assertThat(result, is(156));
    }
}
