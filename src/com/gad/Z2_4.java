package com.gad;

public class Z2_4 {
    public Z2_4(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int a, b, c;

    @Override
    public String toString() {
        if (c * c == b * b + a * a) {
            return "true";
        } else {
            return "false";
        }
    }
}
