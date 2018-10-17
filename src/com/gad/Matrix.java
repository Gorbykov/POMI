package com.gad;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

interface MatrixElementOperator {
    MatrixElement apply(MatrixElement element);
}

interface MatrixCondition {
    boolean apply(int i, int j);
}

class MatrixElement {
    public int i;
    public int j;
    public int el;

    public MatrixElement(int i, int j, int el) {
        this.i = i;
        this.j = j;
        this.el = el;
    }
}

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
        generateRandom(-100, 100);
    }

    public void generateRandom(int a, int b) {
        Random random = new Random();
        this.forEach(element -> new MatrixElement(element.i, element.j, random.nextInt(b + 1 - a) + a));
    }

    public MatrixElement max(MatrixCondition condition) {
        MatrixElement element = new MatrixElement(-1, -1, Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (condition.apply(i, j)) {
                    if (element.el < mat[i][j]) {
                        element.el = mat[i][j];
                        element.i = i;
                        element.j = j;
                    }
                }
            }
        }
        return element;
    }

    public MatrixElement min(MatrixCondition condition) {
        MatrixElement element = new MatrixElement(-1, -1, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (condition.apply(i, j)) {
                    if (element.el > mat[i][j]) {
                        element.el = mat[i][j];
                        element.i = i;
                        element.j = j;
                    }
                }
            }
        }
        return element;
    }

    public void print() {
        Stream.of(mat)
                .map(Arrays::toString)
                .forEach(System.out::println);
    }

    public boolean isMagic() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmpSum = 0;
            for (int j = 0; j < m; j++) {
                tmpSum += mat[i][j];
            }
            if (i == 0) {
                sum = tmpSum;
            } else {
                if (sum != tmpSum)
                    return false;
            }
        }

        for (int i = 0; i < n; i++) {
            int tmpSum = 0;
            for (int j = 0; j < m; j++) {
                tmpSum += mat[j][i];
            }
            if (sum != tmpSum)
                return false;

        }
        return true;
    }

    public void swapRow(int a, int b) {
        for (int i = 0; i < n; i++) {
            swap(a, i, b, i);
        }
    }

    public void swap(int iA, int jA, int iB, int jB) {
        int buf = mat[iA][jA];
        mat[iA][jA] = mat[iB][jB];
        mat[iB][jB] = buf;
    }

    public void forEach(MatrixElementOperator element) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = element.apply(new MatrixElement(i, j, mat[i][j])).el;
            }
        }
    }

}
