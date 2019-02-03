package com.salimrahmani.codewars.digitalroot;

public class DigitalRoot {
    public static int digital_root(int n) {
        return n < 10 ? n : digital_root((n / 10) + (n % 10));
    }
}