package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        printTreeWorlds();
        checkSummSign();
        printColor();
        compareNumbers ();

    }




    private static void printTreeWorlds() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSummSign() {
        int a = 20;
        int b = 5;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }


    private static void printColor() {
        int Color = 101;
        if (Color <= 0) {
            System.out.println("Красный");
        }
        if (Color > 0 && Color <= 100) {
            System.out.println("Желтый");
        }
        if (Color > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 225;
        int b = 360;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
