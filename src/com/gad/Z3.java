package com.gad;

import java.util.concurrent.atomic.AtomicReference;

public class Z3 {
    public static void swap(AtomicReference<Double> x, AtomicReference<Double> y) {
        double a, b, buf;
        a = Math.max(x.get(), y.get());
        b = Math.min(x.get(), y.get());
        buf = b;
        b = (a + b) / 2;
        a = 2 * a * buf;
        if (x.get() == buf) {
            x.set(b);
            y.set(a);
        } else {
            y.set(b);
            x.set(a);
        }
    }
}
