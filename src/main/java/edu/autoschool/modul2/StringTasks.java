package edu.autoschool.modul2;

import java.util.Scanner;

public class StringTasks {
    private final Scanner myObj = new Scanner(System.in);

    public void task1() {
        //1 Дана строка. Вывести первый, последний и средний (если он есть) символы.
        String row = "winter";
        System.out.println(row.substring(0,1));
        System.out.println(row.substring(row.length()-1,row.length()));

        // Напишите программу, которая выводит часть строки до первой встреченной точки, включая точку.
        String row2 = "Hi, everyone. I'm Anna";
        int n = row2.indexOf(".");
        System.out.println(row2.substring(0,n+1));

        // Также предусмотрите вывод количества пробелов.
        int countSpaces = 0;
        for (int i=0; i<row2.length(); i++) {
            char s = row2.charAt(i);
            if (s == ' ') {
                countSpaces++;
            }
        }
        System.out.println("Number of spaces in '" + row2 + "' is " + countSpaces);
    }

    public void task2() {
        //2 Найти в строке указанную подстроку и заменить ее на новую.
        // Строку, ее подстроку для замены и новую подстроку вводит пользователь.
        System.out.println("Type a main row:");
        String mainRow = "";
        mainRow+=myObj.nextLine();

        System.out.println("Type a word to look at the previous entered row:");
        String wordToLookAt = myObj.nextLine(); // Read user input

        System.out.println("Type a word to change into at the previous entered row:");
        String wordToChange = myObj.nextLine(); // Read user input

        System.out.println(mainRow.replace(wordToLookAt, wordToChange));
    }

    public void task3() {
        //3 Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
        // Случай, когда самых длинных слов может быть несколько, не обрабатывать.
        System.out.println("Type several words:");
        String mainRow = "";
        mainRow+=myObj.nextLine();

        String[] words = mainRow.split(" ");
        String longestWord = words[0];
        for (String i : words) {
            if (longestWord.length() < i.length()) {
                longestWord = i;
            }
        }
        System.out.println(longestWord);
    }
}
