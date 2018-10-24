package ru.job4j.condition;

/**
 * Triangle
 * @author Konstantin Filchenkov/
 * @version $Id$.
 * @since 15.10.2018.
 */

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method to calcylate period
     * @param ab -
     * @param bc -
     * @param ca -
     * @return period
     */

    public double period(double ab, double bc, double ca) {
        return (ab + bc + ca) / 2;
    }

    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double bc = this.b.distanceTo(this.c);
        double ca = this.c.distanceTo(this.a);
        double p = this.period(ab, bc, ca);
        if (this.exist(ab, bc, ca)) {
           rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
        }
        return rsl;
    }

    private boolean exist(double ab, double ca, double bc) {
        return ab + bc > ca && ab + ca > bc && bc + ca > ab;
        }

}
