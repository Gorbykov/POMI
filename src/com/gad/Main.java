package com.gad;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try {
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
                            .collect(Collectors.joining(", ")));
                    break;
            }
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
    }
}
