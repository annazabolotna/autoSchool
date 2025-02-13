package edu.autoschool.modul2;

import java.util.Scanner;

public class Main {

    private static final Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello world!");
        printHelloName();
    }

    public static void printHelloName() {
        System.out.println("Type a username:");
        String user = myObj.nextLine();

        System.out.println("Hello, " + user);
    }
}
