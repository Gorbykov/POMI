package com.gad;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            String z = scanner.next();
            switch (z) {
                case "1":
                    int n = scanner.nextInt();
                    System.out.println(new Z1(n));
                    break;
                case "2.1":
                    n = scanner.nextInt();
                    System.out.println(new Z2_1(n));
                    break;
                case "2.2":
                    n = scanner.nextInt();
                    System.out.println(new Z2_2(n));
                    break;
                case "2.3":
                    n = scanner.nextInt();
                    System.out.println(new Z2_3(n));
                    break;
                case "2.4":
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    System.out.println(new Z2_4(a, b, c));
                    break;
                case "2.5":
                    n = scanner.nextInt();
                    System.out.println(new Z2_5(n));
                    break;
                case "2.6":
                    System.out.println(new Z2_6(scanner.next()));
                    break;
                case "3":
                    AtomicReference<Double> x = new AtomicReference<>(scanner.nextDouble());
                    AtomicReference<Double> y = new AtomicReference<>(scanner.nextDouble());
                    Z3.swap(x, y);
                    System.out.println(x.toString() + " " + y.toString());
                    break;
                case "4":
                    Z4 pasTester = new Z4("1234");
                    String password;
                    do {
                        password = scanner.next();
                    } while (!pasTester.check(password));
                    break;
                case "5":
                    System.out.println(new Z5(scanner.nextInt()));
                    break;
                case "6":
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(new Z6(a, b));
                    break;
                case "7":
                    Z7 randomNumber = new Z7();
                    char ch;
                    do {
                        n = scanner.nextInt();
                        ch = randomNumber.guess(n);
                        System.out.println(Integer.toString(n) + ch + "n");
                    } while (ch != '=');
                    break;
                case "8":
                    Z8 p1 = new Z8();
                    for (; ; ) {
                        n = p1.next();
                        if (n == -1) break;
                        System.out.print(Integer.toString(n) + " ");
                    }
                    break;
                case "9":
                    Z9 p2 = new Z9();
                    for (int i = 0; i < 55; i++) {
                        System.out.print(Integer.toString(p2.next()) + " ");
                    }
                    break;
                case "14":
                    n = scanner.nextInt();
                    System.out.println(Z14.factorize(n).stream().map(Object::toString)
                            .collect(Collectors.joining(", "))
                    );
                    break;
                case "15":
                    System.out.println(Stream
                            .iterate(new long[]{1, 1}, f -> new long[]{f[1], f[1] + f[0]})
                            .limit(11)
                            .map(p -> p[0])
                            .map(Object::toString)
                            .collect(Collectors.joining(", "))
                    );
                    break;
                case "16":
                    long l = scanner.nextLong();
                    System.out.println(Arrays
                            .stream(Long
                                    .toString(l)
                                    .split(""))
                            .mapToLong(Long::valueOf)
                            .sum()
                    );
                    break;
                case "17":
                    System.out.println(
                            Stream.iterate(IntStream
                                            .generate(() -> 0)
                                            .limit(6)
                                            .toArray(),
                                    f -> {
                                        boolean flag = false;
                                        int i = 0;
                                        do {
                                            flag = false;
                                            f[i]++;
                                            if (f[i] == 10) {
                                                f[i] = 0;
                                                flag = true;
                                            }
                                            i++;
                                        } while ((flag) && (i < 6));
                                        return f;
                                    })
                                    .limit(1000000)
                                    .skip(1)
                                    .filter(f -> (f[0] + f[1] + f[2]) == (f[3] + f[4] + f[5]))
                                    .count()
                    );
                    break;
                case "18":
                    System.out.println(
                            Stream.iterate(IntStream
                                            .generate(() -> 0)
                                            .limit(6)
                                            .toArray(),
                                    f -> {
                                        boolean flag = false;
                                        int i = 0;
                                        do {
                                            flag = false;
                                            f[i]++;
                                            if (f[i] == 10) {
                                                f[i] = 0;
                                                flag = true;
                                            }
                                            i++;
                                        } while ((flag) && (i < 6));
                                        return f;
                                    })
                                    .limit(1000000)
                                    .skip(1)
                                    .map(f -> Arrays
                                            .stream(f)
                                            .mapToObj(Objects::toString)
                                            .collect(Collectors
                                                    .joining("")))
                                    .filter(f -> f.contains("13") || f.contains("4"))
                                    .count()
                    );
                    break;
                case "19":
                    n = random.nextInt(166 - 5) + 5;
                    if ((n > 25) && (n < 100))
                        System.out.println(Integer.toString(n) + " ∈ (25, 100)");
                    else
                        System.out.println(Integer.toString(n) + " ∉ (25, 100)");
                    break;
                case "20":
                    n = random.nextInt(1000 - 100) + 100;
                    System.out.println("Max digit in "
                            + Integer.toString(n)
                            + " is "
                            + Collections
                            .max(Arrays
                                    .asList(Integer
                                            .toString(n)
                                            .split("")
                                    )
                            )
                    );
            }
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
    }
}
