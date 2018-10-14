package ru.job4j.conditon;

/**
 * Class Point to calculate distance.
 * @author Konstantin Ficlhenkov (filchenkov86@gmail.com)
 * @version $Id$.
 * @since 14.10.2018.
 */

public class Point {
    /**
     * fields x, y.
     */
    int x;
    int y;
    /**
     * constractor
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * used to calculete distance between two points
     * @param that - Object Point.
     * @return distance.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
    public static void main(String[] args) {
        Point a = new Point(0, 5);
        Point b = new Point(2, 5);
        double result = a.distanceTo(b);
        System.out.println("Distance AB: " + result);
    }
}
