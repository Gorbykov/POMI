package com.gad;

public class Z2_5 {

    private int n;

    public Z2_5(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        int[] arr = new int[4];
        boolean[] d = new boolean[10];
        boolean f = false;
        for (int i = 0; i < 4; i++) {
            arr[i] = n % 10;
            n /= 10;
            if (d[arr[i]]) {
                f = true;
            }
            d[arr[i]] = true;
        }
        if (!f && (n == 0)) {
            return "true";
        } else {
            return "false";
        }
    }
}
