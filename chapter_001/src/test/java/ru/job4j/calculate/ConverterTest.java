package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test Converter
 * @author Konstantin Filchenkov (filchenkov86@gmail.com).
 * @version $Id$.
 * @since 13.10.2018
 */

public class ConverterTest {
    /**
     * Test rubToEuro.
     */
    @Test
    public void when70RubtoEuroThanOne() {
       Converter conv = new Converter();
       int result = conv.rubToEuro(70);
       assertThat(result, is(1));
    }
    /**
     * Test rubToDollar.
     */
    @Test
    public void when65RubtoDollarThanOne() {
        Converter conv = new Converter();
        int result = conv.rubToDollar(65);
        assertThat(result, is(1));
    }
    /**
     * Test dolarToRub.
     */
    @Test
    public void whenOneDollartoRubThan65() {
        Converter conv = new Converter();
        int result = conv.dollarToRub(1);
        assertThat(result, is(65));
    }
    /**
     * Test euroToRub.
     */
    @Test
    public void whenOneEurotoRubThan70() {
        Converter conv = new Converter();
        int result = conv.euroToRub(1);
        assertThat(result, is(70));
    }
}
