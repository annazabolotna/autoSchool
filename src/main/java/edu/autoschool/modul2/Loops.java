package edu.autoschool.modul2;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        System.out.println("----------------");
        task8();
        System.out.println("----------------");
        task9();
        System.out.println("----------------");
        task10();
        System.out.println("----------------");
        task11();
        System.out.println("----------------");
        task12();
        System.out.println("----------------");
        task13();
        System.out.println("----------------");
        task14();
        System.out.println("----------------");
        task15();
        System.out.println("----------------");
        task16();
        System.out.println("----------------");
        task17();
        System.out.println("----------------");
        task18();
    }

    private static final Scanner myObj = new Scanner(System.in);

    //while
    //8 Вывести на экран числа от 1 до 10, используя цикл while.
    public static void task8() {
        int i=1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    //9 Вывести на экран числа от 10 до 1, используя цикл while.
    public static void task9() {
        int i=10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void task10() {
        System.out.println("Type a string:");
        String x = myObj.nextLine(); // Read user input

        System.out.println("Type a number:");
        int num = myObj.nextInt(); // Read user input

        int i=1;
        while (i <= num) {
            System.out.println(x);
            i++;
        }
    }

    //11 Вывести на экран квадрат из 10х10 букв S используя цикл while.
    //Буквы в каждой строке не разделять.
    public static void task11() {
        int i=1;
        while (i <= 10) {
            int j=1;
            while (j <= 10) {
                System.out.print("s");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }

    //12 Вывести на экран таблицу умножения 10х10 используя цикл while.
    //Числа разделить пробелом.
    public static void task12() {
        int i=1;
        while (i <= 10) {
            int j=1;
            while (j <= 10) {
                System.out.print(i*j + " ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }

    //loop for
    //13 Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
    //Через пробел либо с новой строки.
    public static void task13() {
        for (int i=2; i<=100; i+=2) {
            System.out.print(i + " ");
        }
    }

    //14 Ввести с клавиатуры два числа m и n.
    //Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
    public static void task14() {
        System.out.println("Type a number of rows:");
        int m = myObj.nextInt(); // Read user input

        System.out.println("Type a number of columns:");
        int n = myObj.nextInt(); // Read user input

        for (int i=1; i<=m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("8");
            }
            System.out.print("\n");
        }
    }

    //15 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    public static void task15() {
        for (int i=1; i<=10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.print("\n");
        }
    }

    //16 Используя цикл for вывести на экран:
    //- горизонтальную линию из 10 восьмёрок
    //- вертикальную линию из 10 восьмёрок.
    public static void task16() {
        for (int i=1; i<=10; i++) {
            System.out.print("8");
        }
        System.out.print("\n");
        for (int j = 1; j <= 10; j++) {
            System.out.println("8");
        }
    }

    //17 Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
    public static void task17() {
        System.out.println("Type a name:");
        String x = myObj.next(); // Read user input
        for (int i=1; i<=10; i++) {
            System.out.println(i +". "+ x + " loves me.");
        }
    }

    public static void task18() {
        for (int i=30; i>=0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finish!)");
    }

}
