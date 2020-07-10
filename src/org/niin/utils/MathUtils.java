package org.niin.utils;

public class MathUtils {

    public static long computeFactorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
