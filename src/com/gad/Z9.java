package com.gad;

public class Z9 {

    private int currentN;

    public Z9() {
        currentN = 1;
    }

    public int next() {
        int ret;
        ret = currentN;
        currentN += 2;
        return ret;
    }
}
