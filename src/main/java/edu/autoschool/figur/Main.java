package edu.autoschool.figur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        List<Figure> figures = new ArrayList<>();

        // Заповнюємо масив випадковими фігурами
        for (int i = 0; i < 10; i++) {
            double x = random.nextDouble() * 100;
            double y = random.nextDouble() * 100;
            double size = random.nextDouble() * 50 + 5; // Випадковий розмір (від 5 до 55)

            switch (random.nextInt(3)) {
                case 0 -> figures.add(new Circle(x, y, size));
                case 1 -> figures.add(new Square(x, y, size));
                case 2 -> figures.add(new Triangle(x, y, size));
            }
        }

        // Сортування фігур за площею
        figures.sort(Collections.reverseOrder()); // DESC сортування

        // Вивід результатів
        System.out.println("Відсортовані фігури:");
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }

}
