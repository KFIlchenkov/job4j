package ru.job4j.calculate;

/**
 * Converter.
 * @author Konstantin Filchenkov (filchenkov86@gmail.com).
 * @version $Id$.
 * @since 13.10.2018.
 */

public class Converter {
    /**
     * RubToEuro
     *
     * @param value - rub.
     * @return euro - euro.
     */
    public int rubToEuro(int value) {
        return value / 70;
    }

    /**
     * RubToDollar
     *
     * @param value - rub.
     * @return dollar - dollar.
     */
    public int rubToDollar(int value) {
        return value / 65;
    }
    /**
     * DollarToRub
     *
     * @param value - dollar.
     * @return rub - rub.
     */
    public int dollarToRub(int value) {
        return value * 65;
    }
    /**
     * EuroToRub.
     *
     * @param value - Euro.
     * @return rub - rub.
     */
    public int euroToRub(int value) {
        return value * 70;
    }
}
