package ru.geekbrains.lesson_2;

public class Main {
    public static void main(String[] args) {
        within10and20();
        isPositiveOrNegative();
        isNegative();
        printWorldNTimes();
    }


    // Задание 1
    private static boolean within10and20() {
        int x1 = 5;
        int x2 = 2;
        int sum = x1 + x2;
        boolean x = sum > 10 && sum <= 20;
        System.out.println(x);
        return x;

    }
    //Задание 2

    private static void isPositiveOrNegative() {
        int x = 0;
        if (x >= 0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
    }

    //Задание 3
    private static boolean isNegative() {

        int i = -50;
        boolean x = i <= 0;
        System.out.println(x);
        return x;
    }

    //Здание 4
    public static void printWorldNTimes() {
        for (int j = 0; j < 3; j++) {

                System.out.println("Java");
            }
        }

}


