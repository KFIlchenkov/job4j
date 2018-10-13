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
        int euro = value / 70;
        return euro;
    }

    /**
     * RubToDollar
     *
     * @param value - rub.
     * @return dollar - dollar.
     */
    public int rubToDollar(int value) {
        int dollar = value / 65;
        return dollar;
    }
    /**
     * DollarToRub
     *
     * @param value - dollar.
     * @return rub - rub.
     */
    public int dollarToRub(int value) {
        int rub = value * 65;
        return rub;
    }
    /**
     * EuroToRub.
     *
     * @param value - Euro.
     * @return rub - rub.
     */
    public int euroToRub(int value) {
        int rub = value * 70;
        return rub;
    }
}
