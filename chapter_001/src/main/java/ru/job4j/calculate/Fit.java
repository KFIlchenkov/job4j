package ru.job4j.calculate;

/**
 * Class Fit to calculate ideal weight.
 * @author Konstantin Filchenkov (filchenkov86@gmail.com)
 * @version $Id$.
 * @since 14.10.2018
 */
public class Fit {
        public double weight;
    /**
     * Ideal man's weight;
     * @param height - man's height
     * @return weight - man's weight.
     */
    public double manWeight(double height) {
        weight = (height - 100) * 1.15;
        return weight;
    }
    /**
     * Ideal woman's weight;
     * @param height - woman's height
     * @return weight - woman's weight.
     */
    public double womanWeight(double height) {
        weight = (height - 110) * 1.15;
        return weight;
    }
}
