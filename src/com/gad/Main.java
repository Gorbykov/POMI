package com.gad;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.*;

public class Main {


    public static void main(String[] args) {
        try {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            String z;
            do {
                z = scanner.next();
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
                    case "10": {
                        System.out.println(Arrays.toString(IntStream.iterate(90, f -> f - 5)
                                .takeWhile(f -> f >= 0)
                                .toArray())
                        );
                        break;
                    }
                    case "11": {
                        System.out.println(Arrays.toString(IntStream.iterate(2, f -> 2 * f - 1)
                                .takeWhile(f -> f < 10000)
                                .toArray())
                        );
                        break;
                    }
                    case "12": {
                        System.out.println(Arrays.toString(IntStream.iterate(-166, f -> 2 * f + 200)
                                .takeWhile(f -> f < 100)
                                .filter(f -> Integer.toString(Math.abs(f)).length() == 2)
                                .toArray())
                        );
                        break;
                    }
                    case "13": {
                        int m = scanner.nextInt();
                        System.out.println(Arrays.toString(LongStream.rangeClosed(2, m / 2)
                                .filter(f -> m % f == 0)
                                .toArray())
                        );
                        break;
                    }
                    case "14":
                        n = scanner.nextInt();
                        System.out.println(Z14.factorize(n).stream().map(Object::toString)
                                .collect(Collectors.joining(", "))
                        );
                        break;
                    case "15":
                    case "25":
                        System.out.println(Stream
                                .iterate(new long[]{1, 1}, f -> new long[]{f[1], f[1] + f[0]})
                                .limit(z.equals("15") ? 11 : z.equals("25") ? 20 : 0)
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
                                            boolean flag;
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
                                            boolean flag;
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
                        break;
                    case "21":
                        n = random.nextInt(28800 + 1);
                        System.out.println(n);
                        n = Math.floorDiv(n, 60 * 60);
                        if (n > 1)
                            System.out.println("There are " + n + " hours left, until The End of The Working Day");
                        else {
                            if (n == 1)
                                System.out.println("There is an hour left until The End of The Working Day");
                            else if (n == 0)
                                System.out.println("The End of The Working Day is near!!!!");
                        }
                        break;
                    case "22": {
                        int[] arr;
                        arr = IntStream
                                .generate(() -> random.nextInt(10) + 1)
                                .limit(8)
                                .toArray();
                        System.out.println(Arrays.toString(arr));
                        System.out.println(Arrays
                                .toString(IntStream
                                        .range(0, 8)
                                        .map(i -> (i % 2 == 0) ? arr[i] : 0)
                                        .toArray()
                                )
                        );
                        break;
                    }
                    case "23": {
                        int[] arr = IntStream
                                .generate(() -> random.nextInt(6))
                                .limit(5)
                                .toArray();
                        System.out.println(Arrays.toString(arr));
                        //noinspection OptionalGetWithoutIsPresent
                        double average1 = IntStream.of(arr).average().getAsDouble();
                        arr = IntStream
                                .generate(() -> random.nextInt(6))
                                .limit(5)
                                .toArray();
                        System.out.println(Arrays.toString(arr));
                        //noinspection OptionalGetWithoutIsPresent
                        double average2 = IntStream.of(arr).average().getAsDouble();
                        n = Double.compare(average1, average2);
                        System.out.println(Double.toString(average1)
                                + ((n == 0) ? " = " : (n > 0 ? " > " : " < "))
                                + Double.toString(average2)
                        );
                        break;
                    }
                    case "24": {
                        int[] arr = IntStream
                                .generate(() -> random.nextInt(100 - 10) + 10)
                                .limit(4)
                                .toArray();
                        System.out.println(Arrays.toString(arr));
                        System.out.println(IntStream
                                .range(0, arr.length - 1)
                                .map(i -> arr[i + 1] - arr[i])
                                .filter(f -> f > 0)
                                .count() == 0 ? "Возрастающая\uD83D\uDCA9" : "Невозрастающая или убывающая\uD83D\uDCA9"
                        );
                        break;
                    }
                    case "26": {
                        int[] arr = IntStream
                                .generate(() -> random.nextInt(31) - 15)
                                .limit(12)
                                .toArray();
                        System.out.println(Arrays.toString(arr));
                        IntStream.range(0, arr.length)
                                .boxed()
                                .max(Comparator.comparingInt(i -> arr[i]))
                                .ifPresent(i -> System.out.println("max: arr[" + i + "] = " + arr[i]));
                        break;
                    }
                    case "27": {
                        int[] arr1 = IntStream
                                .generate(() -> random.nextInt(10) + 1)
                                .limit(10)
                                .toArray();
                        int[] arr2 = IntStream
                                .generate(() -> random.nextInt(10) + 1)
                                .limit(10)
                                .toArray();
                        System.out.println(Arrays.toString(arr1));
                        System.out.println(Arrays.toString(arr2));
                        double[] arrD = IntStream.range(0, arr1.length)
                                .mapToDouble(i -> ((double) arr1[i]) / arr2[i])
                                .toArray();
                        System.out.println(Arrays.toString(arrD));
                        System.out.println(DoubleStream.of(arrD)
                                .filter(f -> Double.compare(f, Math.round(f)) == 0)
                                .count()
                        );
                        break;
                    }
                    case "28": {
                        int[] arr = IntStream
                                .generate(() -> random.nextInt(3) - 1)
                                .limit(11)
                                .toArray();
                        System.out.println(Arrays.toString(arr));
                        IntStream.rangeClosed(-1, 1)
                                .mapToObj(i -> new int[]{i
                                        , (int) IntStream.of(arr)
                                        .boxed()
                                        .filter(f -> f == i)
                                        .count()}
                                )
                                .reduce((f1, f2) ->
                                        f1[1] - f2[1] > 0 ? f1
                                                : (f1[1] - f2[1] < 0 ? f2 : new int[]{Integer.MAX_VALUE, f2[1]})
                                )
                                .ifPresent(f -> {
                                            if (f[0] != Integer.MAX_VALUE) {
                                                System.out.println(f[0] + " встречается " + f[1] + " раз");
                                            }
                                        }
                                );
                        break;
                    }
                    case "29": {
                        while ((n = scanner.nextInt()) % 2 == 1 && n > 0) ;
                        int[] arr = IntStream
                                .generate(() -> random.nextInt(11) - 5)
                                .limit(n)
                                .toArray();
                        System.out.println(Arrays.toString(arr));
                        arr = IntStream.of(arr)
                                .map(Math::abs)
                                .toArray();
                        a = IntStream.of(arr)
                                .limit(n / 2)
                                .sum();
                        b = IntStream.of(arr)
                                .skip(n / 2)
                                .sum();
                        System.out.println(a + ((a > b) ? " > " : (a < b) ? " < " : " = ") + b);
                        break;
                    }
                    case "30": {
                        int[] pA = IntStream
                                .generate(() -> random.nextInt(10) + 1)
                                .limit(6)
                                .toArray();
                        int[] nA = IntStream
                                .generate(() -> -(random.nextInt(10) + 1))
                                .limit(6)
                                .toArray();
                        List<Integer> outL = IntStream
                                .concat(IntStream.of(pA), IntStream.of(nA))
                                .boxed()
                                .collect(Collectors.toList());
                        Collections.shuffle(outL, random);
                        System.out.println(Arrays.toString(outL.toArray()));
                        break;
                    }

                    case "31": {
                        while ((n = scanner.nextInt()) <= 3) ;
                        int m = n;
                        int[] arr = IntStream.generate(() -> random.nextInt(m + 1))
                                .limit(m)
                                .toArray();
                        System.out.println(Arrays.toString(arr));
                        int[] arrOdd = IntStream.of(arr)
                                .filter(f -> f % 2 == 0)
                                .toArray();
                        System.out.println(Arrays.toString(arrOdd));
                        break;
                    }
                    case "32": {
                        int[][] arr = Stream.generate(() ->
                                IntStream.generate(() -> random.nextInt(10))
                                        .limit(7)
                                        .toArray())
                                .limit(6)
                                .toArray(int[][]::new);
                        Stream.of(arr)
                                .forEach(f -> System.out.println(Arrays.toString(f)));
                        System.out.println("---------------------");
                        for (int[] f : arr) {
                            List<Integer> buf = Arrays.stream(f).boxed().collect(Collectors.toList());
                            Collections.swap(buf, 0,
                                    IntStream.range(0, 7)
                                            .mapToObj(i -> new int[]{i, f[i]})
                                            .max(Comparator.comparingInt(g -> g[1]))
                                            .map(g -> g[0])
                                            .get()
                            );
                            System.out.println(Arrays.toString(buf.toArray()));
                        }
                        break;
                    }
                    case "33": {
                        List<String> outL = IntStream.rangeClosed(2, 9)
                                .mapToObj(i -> IntStream.rangeClosed(2, i)
                                        .mapToObj(j -> Integer.toString(i) + "*" + Integer.toString(j))
                                )
                                .flatMap(f -> f)
                                .collect(Collectors.toList());
                        Collections.shuffle(outL, random);
                        System.out.println(String.join("\n", outL.subList(0, 15)));
                        break;
                    }
                    case "35": {
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        int[][] arr = Stream.generate(() ->
                                IntStream.generate(() -> random.nextInt(100))
                                        .limit(b)
                                        .toArray())
                                .limit(a)
                                .peek(f -> System.out.println(Arrays.toString(f)))
                                .toArray(int[][]::new);
                        int sum[] = new int[b];
                        Arrays.fill(sum, 0);
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {
                                sum[j] += arr[i][j];
                            }
                        }
                        int k = 0;
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {
                                if (2 * arr[i][j] > sum[j]) k++;
                            }
                        }
                        System.out.println(k);
                        break;
                    }
                    case "39": {
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        int[][] arr = Stream.generate(() ->
                                IntStream.generate(() -> random.nextInt(201) - 100)
                                        .limit(b)
                                        .toArray())
                                .limit(a)
                                .peek(f -> System.out.println(Arrays.toString(f)))
                                .toArray(int[][]::new);
                        c = scanner.nextInt();
                        int maxI = 0, maxJ = 0, max = Integer.MIN_VALUE;
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {
                                if (max < arr[i][j]) {
                                    maxI = i;
                                    maxJ = j;
                                    max = Math.abs(arr[i][j]);
                                }
                            }
                        }
                        List<List<Integer>> list = Stream.of(arr)
                                .map(f -> IntStream.of(f)
                                        .boxed()
                                        .collect(Collectors.toList()
                                        )
                                ).collect(Collectors.toList());
                        for (List<Integer> line : list) {
                            Collections.swap(line, c, maxJ);
                        }
                        Collections.swap(list, c, maxI);
                        list.forEach(f -> System.out.println(Arrays.toString(f.toArray())));
                        break;
                    }
                    case "40": {
                        int m = scanner.nextInt();
                        int[][] arr = Stream.generate(() ->
                                IntStream.generate(() -> random.nextInt(201) - 100)
                                        .limit(m)
                                        .toArray())
                                .limit(m)
                                .peek(f -> System.out.println(Arrays.toString(f)))
                                .toArray(int[][]::new);
                        System.out.println("---------------------");
                        Stream.of(arr)
                                .map(f -> IntStream.of(f)
                                        .map(g -> g <= 0 ? 0 : 1)
                                        .toArray()
                                )
                                .forEach(f -> System.out.println(Arrays.toString(f)));
                    }
                }

            } while (!z.equals("e"));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

