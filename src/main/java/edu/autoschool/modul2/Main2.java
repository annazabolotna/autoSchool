package edu.autoschool.modul2;

import edu.autoschool.modul2.com.welcome.Hello;

public class Main2 {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.setupName("Anna");
        hello.welcome();
        System.out.println("Hello, world!");
        hello.byeBay();
    }
}
