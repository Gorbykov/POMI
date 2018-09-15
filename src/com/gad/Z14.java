package com.gad;

import java.util.ArrayList;

public class Z14 {

    public static ArrayList<Integer> factorize(int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 2; i <= n; i++) {
            if (!list.get(i).isEmpty()) continue;
            for (int j = i; j <= n; j += i) {
                list.get(j).add(i);
            }
        }
        return list.get(list.size() - 1);
    }
}
