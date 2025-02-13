package edu.autoschool.modul2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysTasks {

    public static void main(String[] args) {
        System.out.println("----------------");
        task1();
        System.out.println("----------------");
        task2();
        System.out.println("----------------");
        task3();
        System.out.println("----------------");
        task4();
        System.out.println("----------------");
        task5();
    }

    private static final Scanner myObj = new Scanner(System.in);

    public static void task1() {
        //ввод строк с клавиатуры
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++)
        {
            System.out.println("Type a number " + (i + 1) + " of " + list.length + ":");
            list[i] = myObj.nextInt(); // Read user input
        }

        int max = list[0];
        for (int i = 1; i < list.length; i++)
        {
            if (max < list[i]) {
                max = list[i];
            }
        }
        System.out.println("Max number is: " + max);
    }

    public static void task2() {
        //ввод строк с клавиатуры
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++)
        {
            System.out.println("Type a string " + (i + 1) + " of " + list.length + ":");
            list[i] = myObj.next(); // Read user input
        }

        System.out.println("Strings in reverse order:");
        for (int j = 0; j < list.length; j++) {
            System.out.println(list[9-j]);
        }
    }

    public static void task3() {
        //1. Создать массив на 10 строк.
        String[] list = new String[10];
        //2. Создать массив на 10 чисел.
        int[] lengthList = new int[10];
        //3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        for (int i = 0; i < list.length; i++)
        {
            System.out.println("Type a string " + (i + 1) + " of " + list.length + ":");
            list[i] = myObj.next(); // Read user input
        }
        //4. В каждую ячейку массива чисел записать длину строки из массива строк,
        // индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
        System.out.println("Strings length:");
        for (int j = 0; j < lengthList.length; j++)
        {
            lengthList[j] = list[j].length();
            //5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
            System.out.println(lengthList[j]);
        }
    }

    public static void task4() {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++)
        {
            System.out.println("Type a number " + (i + 1) + " of " + list.length + ":");
            list[i] = myObj.nextInt(); // Read user input
        }
        System.out.println("Numbers in reverse order:");
        for (int j = 0; j < list.length; j++) {
            System.out.println(list[9-j]);
        }
    }

    public static void task5() {
        //1. Создать массив на 20 чисел.
        int[] bigList = new int[20];
        //2. Ввести в него значения с клавиатуры.
        for (int i = 0; i < bigList.length; i++)
        {
            System.out.println("Type a number " + (i + 1) + " of 20:");
            bigList[i] = myObj.nextInt(); // Read user input
        }
        //3. Создать два массива на 10 чисел каждый.
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        //4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        for (int j = 0; j < bigList.length; j++) {
            if (j < bigList.length/2) {
                list1.add(bigList[j]);
            }
            else {
                list2.add(bigList[j]);
            }
        }
        System.out.println("Second array:");
        for (int x : list2) {
            System.out.println(x);
        }
    }
}
