package com.gad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        }
    }
}
