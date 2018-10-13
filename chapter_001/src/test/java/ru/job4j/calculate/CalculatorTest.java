package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 13.10.2018
 */

public class CalculatorTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test div
     */
    @Test
    public void whenTwoDivTwoThenOne() {
        Calculator calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * Test sub.
     */
    @Test
    public void whenFourSubTwoThenTwo() {
        Calculator calc  = new Calculator();
        calc.sub(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test multip.
     */
    @Test
    public void whenTwoMultipTwoThenFour() {
        Calculator calc  = new Calculator();
        calc.multip(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}
