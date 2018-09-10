package com.gad;

public class Z1 {

    public Z1(int n) {
        this.n = n;
    }

    private int n;

    @Override
    public String toString() {
        Long N = 1L;
        StringBuilder buf  = new StringBuilder("");
        for (int i = 1; i <= 4; i++) {
            N*=n;
            buf.append(N.toString() + " ");
        }
        return buf.toString();
    }
}
