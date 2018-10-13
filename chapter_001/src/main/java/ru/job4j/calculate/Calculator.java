package ru.job4j.calculate;

/**
 * Calculator.
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 13.10.2018.
 */

public class Calculator {
    /**
     * Внутренее поле result.
     */
    public double result;
    /**
     * Add.
     * @param first - first.
     * @param second - second.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Div.
     * @param first - first.
     * @param second - second.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Sub.
     * @param first - first.
     * @param second - second.
     */
    public void sub(double first, double second) {
        this.result = first - second;
    }
    /**
     * Multip.
     * @param first - first.
     * @param second - second.
     */
    public void multip(double first, double second) {
        this.result = first * second;
    }
    /**
     * getResult.
     */
    public double getResult() {
        return this.result;
    }
}
