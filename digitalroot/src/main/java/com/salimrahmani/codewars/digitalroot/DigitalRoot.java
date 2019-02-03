package com.salimrahmani.codewars.digitalroot;

public class DigitalRoot {
    public static int digital_root(int n) {
        return n < 10 ? n : digital_root(sum_digits(n));
    }

    private static int sum_digits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }
}