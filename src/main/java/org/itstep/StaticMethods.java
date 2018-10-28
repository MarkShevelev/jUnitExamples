package org.itstep;

public class StaticMethods {
    public static double sqr(double x) {
        return x*x;
    }

    public static double positive_power(double base, int exponent) {
       return 0 == exponent%2
               ? sqr(positive_power(base,exponent/2))
               : base*sqr(positive_power(base,(exponent-1)/2));
    }

    public static double power_tailrec(double base, double res, int exponent) {
        if (0 == exponent) return res;
        return power_tailrec(base,0 == exponent%2 ? res*res : res*base, 0 == exponent%2 ? exponent/2 : exponent - 1);
    }
}
