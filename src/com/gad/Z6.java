package com.gad;

public class Z6 {
    private int n, k;

    public Z6(int n, int k) {
        this.n = Math.max(1, Math.min(4, n));
        this.k = k;
    }

    @Override
    public String toString() {
        Long buf = 0L;
        for (int i = (int) Math.round(Math.pow(10, n - 1)); i < Math.round(Math.pow(10, n)); i++) {
            if (i % k == 0)
                buf += i;
        }
        return buf.toString();
    }
}
