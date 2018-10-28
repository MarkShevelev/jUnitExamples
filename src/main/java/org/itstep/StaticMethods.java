package org.itstep;

public class StaticMethods {
    /**
     * A function to calculate positive power with optimization
     * */
    public static double positivePower(double base, int exponent) {
        double res = 1.;
        int reducingExponent = 0 == exponent%2 ? exponent-1 : exponent;
        while (0 != reducingExponent) {
            res *= 0 == reducingExponent%2 ? res : base;
            reducingExponent = 0 == reducingExponent%2 ? reducingExponent/2 : reducingExponent -1;
        }

        return res*(0 == exponent%2 ? base : 1.);
    }
}
