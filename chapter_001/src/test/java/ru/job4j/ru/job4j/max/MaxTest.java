package ru.job4j.ru.job4j.max;
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
        int result = max.muximum(1, 2);
        assertThat(result, is(2));
    }
}
