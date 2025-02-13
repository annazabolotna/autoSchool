package edu.autoschool.modul2;

import java.util.Scanner;

public class Main {

    private static final Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello world!");
        printHelloName();

        System.out.println("Task 1: " + divisionWithRemainder(21, 8));
        System.out.println("Task 2: " + sumNumbers(29));
        System.out.println("Task 3: " + Math.round(22.85F));
        task4(0,2,5);
    }

    public static void printHelloName() {
        System.out.println("Type a username:");
        String user = myObj.nextLine();

        System.out.println("Hello, " + user);
    }

    public static String divisionWithRemainder(int q, int w) {
        int divisionResult = q / w;
        int remainder = q% w;
        String result = "Result is " + divisionResult + " and " + remainder + " in reminder.";
        return result;
    }

    public static int sumNumbers(int n) {
        int sum = 0;
        for ( ; n > 0; n /= 10)
            sum += n % 10;
        return sum;
    }

    public static void task4(int a, int b, int c) {
        int newA, newB, newC;
        newA = a+b;
        newB = c-a;
        newC = a+b+c;
        System.out.print("Task 4: old values "+ a +", "+ b +", "+ c + ". ");
        System.out.println("New values "+ newA +", "+ newB +", "+ newC + ".");
    }
}
