package com.gad;

import java.util.Random;

public class Z7 {
    private int n;

    public Z7() {
        Random random = new Random();
        n = random.nextInt(9) + 1;
    }

    public char guess(int n) {
        if (n == this.n) {
            return '=';
        } else if (n < this.n) {
            return '<';
        } else if (n > this.n) {
            return '>';
        }
        return '?';
    }
}
