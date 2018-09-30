package com.gad;

import java.util.Random;

public class Matrix {

    private int[][] mat;
    private int n;
    private int m;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        mat = new int[n][m];
    }

    public Matrix(int n) {
        this.n = n;
        this.m = n;
        mat = new int[n][m];
    }

    public void generateRandom() {
        generateRandom(-100,100);
    }

    public void generateRandom(int a, int b) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = random.nextInt(a + 1 - b) + b;
            }
        }
    }


}
