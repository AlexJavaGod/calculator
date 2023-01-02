package ru.alexhard.calculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        Integer a = in.nextInt();

        System.out.println("Введите математический знак");
        String s = in.next();

        System.out.println("Введите второе число");
        Integer b = in.nextInt();
        System.out.print(a + s + b + "=");

        if (s.equals("+")) {
            System.out.println(a + b);
        }
        if (s.equals("-")) {
            System.out.println(a - b);
        }
        if (s.equals("*")) {
            System.out.println(a * b);
        }
        if (s.equals("/")) {
            System.out.println(a / b);
        }


    }

}
