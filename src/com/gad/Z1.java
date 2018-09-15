package com.gad;

public class Z1 {

    private int n;

    public Z1(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        Long N = 1L;
        StringBuilder buf = new StringBuilder();
        for (int i = 1; i <= 4; i++) {
            N *= n;
            buf.append(N.toString());
            buf.append(" ");
        }
        return buf.toString();
    }
}
