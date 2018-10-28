package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * ArrayDuplicateTest.
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 28.10.2018.
 */

public class ArrayDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate array = new ArrayDuplicate();
        String[] inputArray = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир", "Привет", "Привет"};
        String[] result = array.remove(inputArray);
        String[] expected = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expected));
    }
}
