package com.gad;

public class Z2_1 {
    public Z2_1(int n) {
        this.n = n;
    }

    private int n;

    @Override
    public String toString() {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        if (arr[0]+arr[1]==arr[2]+arr[3]) {
            return "true";
        }
        else {
            return "false";
        }
    }
}
