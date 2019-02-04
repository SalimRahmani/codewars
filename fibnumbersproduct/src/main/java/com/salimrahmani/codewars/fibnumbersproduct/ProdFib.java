package com.salimrahmani.codewars.fibnumbersproduct;

public class ProdFib {
    public static long[] productFib(long prod) {

        long lowFib = 0;
        long hiFib = 1;
        long result = 0;

        while (result < prod) {
            hiFib += lowFib;
            lowFib = hiFib - lowFib;
            result = hiFib * lowFib;
        }

        long[] resultArr = new long[3];

        resultArr[0] = lowFib;
        resultArr[1] = hiFib;
        resultArr[2] = result == prod ? 1 : 0;
        return resultArr;
    }
}
