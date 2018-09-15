package com.gad;

public class Z5 {
    private int n;

    public Z5(int n) {
        this.n = Math.max(1, Math.min(4, n));
    }

    @Override
    public String toString() {
        long a = Math.round(Math.pow(10, n - 1));
        long b = Math.round(Math.pow(10, n)) - 1;
        return Long.toString(((a + b) * (b - a + 1) / 2));
    }
}
