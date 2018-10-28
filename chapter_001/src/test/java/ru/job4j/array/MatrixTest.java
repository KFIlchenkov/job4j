package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void when2on2() {
        Matrix table = new Matrix();
        int[][] result = {
                {1, 2},
                {2, 4}
        };
        assertThat(result, is(table.multiple(2)));
    }
}
