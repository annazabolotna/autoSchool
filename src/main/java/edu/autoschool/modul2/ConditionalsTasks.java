package edu.autoschool.modul2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ConditionalsTasks {

    public static void main(String[] args) {
        System.out.println("----------------");
        printMinNumber();
        System.out.println("----------------");
        printMaxNumber();
        System.out.println("----------------");
        printNumbersDesc();
        System.out.println("----------------");
        namesComparison();
        System.out.println("----------------");
        task5();
        System.out.println("----------------");
        task6();
        System.out.println("----------------");
        guessNumber();
    }

    private static final Scanner myObj = new Scanner(System.in);

    public static void printMinNumber() {
        int x, y, min;
        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj.nextInt(); // Read user input

        min = Math.min(x, y);
        System.out.println("Min number is: " + min); // Print the min number
    }

    public static void printMaxNumber() {
        int[] numbers = new int[4];
        
        for (int i=0; i<numbers.length; i++) {
            System.out.println("Type a number:");
            numbers[i] = myObj.nextInt(); // Read user input
        }
        
        int maxNum = numbers[0];
        for (int j : numbers) {
            if (maxNum < j) {
                maxNum = j;
            }
        }
        System.out.println("Max number is: " + maxNum); // Print the max number
    }

    public static void printNumbersDesc() {
        int[] numbers = new int[3];

        for (int i=0; i<numbers.length; i++) {
            System.out.println("Type a number:");
            numbers[i] = myObj.nextInt(); // Read user input
        }

        Arrays.sort(numbers);
        System.out.println("Numbers in descending order: ");
        for (int j : numbers) {
            System.out.println(j);
        }
    }

    //4 Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
    // Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
    public static void namesComparison() {
        System.out.println("Type a first name:");
        String firstName = myObj.next();

        System.out.println("Type a second name:");
        String secondName = myObj.next();

        if (firstName.toLowerCase().equals(secondName.toLowerCase())) {
            System.out.println("Names are the same");
        }
        else if (firstName.length() == secondName.length()) {
                System.out.println("Name's lenght is the same");

        }
        else {
            System.out.println("Names are different");
        }
    }

    //5 Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    public static void task5() {
        System.out.println("Type a name:");
        String name = myObj.next();

        System.out.println("Type an age");
        int age = myObj.nextInt();

        if (age < 18) {
            System.out.println(name + " should grow up.");
        }
    }

    //6 Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
    public static void task6() {
        System.out.println("Type a name:");
        String name = myObj.next();

        System.out.println("Type an age");
        int age = myObj.nextInt();

        if (age > 20) {
            System.out.println("And 18 is enough.");
        }
    }

    public static void guessNumber() {
        Random random = new Random();
        // Генерируем число от 0 до 20
        int secret = random.nextInt(20 + 1);
        int i=0;
        int j=7;
        while (i < 7) {
            System.out.println("Type a number " + j + ":");
            int number = myObj.nextInt();
            if (number == secret) {
                System.out.println("You guessed it!");
                break;
            } else if (number > secret) {
                System.out.println("Too big");
            } else if (number < secret) {
                System.out.println("Too small");
            }
            i++;
            j--;
        }
        if (j==0) {
            System.out.println("You didn't guess the number, it was " + secret);
        }
    }
}
