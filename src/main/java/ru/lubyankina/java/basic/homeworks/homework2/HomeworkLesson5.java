package ru.lubyankina.java.basic.homeworks.homework2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkLesson5 {

    public static void main(String[] args) {
        printArguments(5,"Java");

    }
// Задание 1. Метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз.
    public static void printArguments(int number, String argument) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
                    System.out.println(Arrays.toString(array));
        }
    }


}
