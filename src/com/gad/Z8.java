package com.gad;

public class Z8 {
    private int currentN;

    public Z8() {
        currentN = 1000;
    }

    public int next() {
        int ret;
        if ((currentN > 9999) || (currentN == -1)) {
            ret = -1;
        } else {
            ret = currentN;
        }
        currentN += 3;
        return ret;
    }
}
