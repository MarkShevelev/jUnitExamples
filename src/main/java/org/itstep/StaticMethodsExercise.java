package org.itstep;

public class StaticMethodsExercise {
    /**
     * A function to calculate positive power with optimization
     * */
    public static double positivePower(double base, int exponent) {
        if (exponent < 0) throw new IllegalArgumentException("Negative exponent not allowed!");

        if (0 == exponent) return 1.;
        double res = 1.;
        while (1 < exponent) {
            if (0 == exponent%2) {
                base *= base;
                exponent /= 2;
            } else {
                res *= base;
                --exponent;
            }
        }
        return res*base;
    }
}
