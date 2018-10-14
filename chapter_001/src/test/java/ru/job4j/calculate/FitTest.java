package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * TestFit.
 * @author Konstantin Filchenkov (filchenkov86@gmail.com).
 * @version $Id$.
 * @since 14.10.2018.
 */
public class FitTest {
    /**
            * Test manWeight.
            */
    @Test
    public void manWeight() {
       Fit fit = new Fit();
       double weight = fit.manWeight(180);
       assertThat(weight, closeTo(92, 0.1));
    }
    /**
     * Test womanWeight.
     */
    @Test
    public void womanWeght() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, closeTo(69, 1));

    }
}
