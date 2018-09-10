package com.gad;

public class Z2_2 {
    public Z2_2(int n) {
        this.n = n;
    }

    private int n;

    @Override
    public String toString() {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        if ((arr[0] + arr[1] + arr[2]) % 2 == 0) {
            return "true";
        } else {
            return "false";
        }
    }
}
