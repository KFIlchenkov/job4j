package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Konstantin Filchenkov (filchenkov86@gmail.com).
 * @version %Id$
 * @since 27.10.18
 */

public class ArrayCharTest {

    /**
     * test startWith True.
     */

    @Test
    public void whenStartWithPrefixThanTrue() {
        ArrayChar word = new ArrayChar("Hellow");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    /**
     * test startWith False.
     */

    @Test
    public void whenNotStartWithPrefixThanFalse() {
        ArrayChar word = new ArrayChar("Hellow");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }
}
