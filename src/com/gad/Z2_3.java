package com.gad;

public class Z2_3 {
    public Z2_3(int n) {
        this.n = n;
    }

    private int n;

    @Override
    public String toString() {
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        if ((arr[0] % 2 == 0) && (n == 0)) {
            return "true";
        } else {
            return "false";
        }
    }
}
