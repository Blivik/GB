package geekbrains.org;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        invertArray();
        fillArrays();
        changeArray();
        createSquare();
        initialValue(10,15);
    }

    public static void invertArray() {
        out.println("\nЗадание 1.");
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < 10; i++) {
            out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        out.println(" after ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void fillArrays() {
        out.println("\nЗадание 2.");

        int[] num = new int[100];
        int value = 1;

        for (int i = 0; i < num.length; i++) {
            num[i] = value;
            value += 1;
            System.out.print(" " + num[i]);
        }
    }

    public static void changeArray() {
        out.println("\nЗадание 3.");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i : arr) {
            out.print(i + " ");
        }
        out.println("after");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;

            out.print(arr[i] + " ");
        }
    }

    public static void createSquare() {
        out.println("\nЗадание 4.");
        int [][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++){
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        } for (int i = 0; i < arr.length; i++){
            System.out.println();
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }

            }

    public static int[] initialValue (int len, int initialValue) {
        out.println("\nЗадание 5.");
        int[] arr = new int[len];
        for (int i = 0; i< arr.length; i++){
            arr[i] = initialValue;
            out.print(arr[i] + " ");
        }
        return arr;
    }
        }







