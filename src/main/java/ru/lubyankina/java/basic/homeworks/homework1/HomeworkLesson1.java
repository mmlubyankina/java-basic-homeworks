package ru.lubyankina.java.basic.homeworks.homework1;

import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson1 {

    public static void main(String[] args) {
        greetings();
        checkSign(7, 15, -50);
        selectColor(9);
        compareNumbers(-33, 100);
        addOrSubtractAndPrint(5, 89, false);
        HappyEnd();
    }


    // Задание № 1:
    public static void greetings() {
        System.out.println("\nРезультат выполнения Задания № 1:");
        System.out.println("Hello\nWorld\nfrom\nJava");
    }


    // Задание № 2:
    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("\nРезультат выполнения Задания № 2:");
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


    // Задание № 3:
    public static void selectColor(int data) {
        System.out.println("\nРезультат выполнения Задания № 3:");
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }


    // Задание № 4:
    public static void compareNumbers(int a1, int b1) {
        System.out.println("\nРезультат выполнения Задания № 4:");
        if (a1 >= b1) {
            System.out.println("a1 >= b1");
        } else {
            System.out.println("a1 < b1");
        }
    }


    // Задание № 5:
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result1 = initValue + delta;
        int result2 = initValue - delta;
        System.out.println("\nРезультат выполнения Задания № 5:");
        if (increment) {
            System.out.println(result1);
        } else {
            System.out.println(result2);
        }
    }


    // Задание № 6:
    public static void HappyEnd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадание № 6. Введите число от 1 до 5:");
        int d = scanner.nextInt();
        System.out.println("Введено число: " + d);
        if (d == 1){
            System.out.println("\nВыполняется Задание №1");
            greetings();
        } else if (d == 2){
            int a = (int)(Math.random() * 100);
            int b = (int)(Math.random() * 100);
            int c = (int)(Math.random() * 100);
            System.out.println("Сгенерированы числа: " + "\na = " + a
                    + "\nb = " + b
                    + "\nc = " + c
                    + "\nВычисляется решение для Задания №2");
            checkSign(a, b, c);
        } else if (d == 3){
            int data = (int)((Math.random() * (40 + 1)) - 20);
            System.out.println("Сгенерировано число: " + data + "\nВычисляется решение для Задания №3");
            selectColor(data);
        } else if (d == 4){
            int a1 = (int)((Math.random() * (200+1)) - 100);
            int b1 = (int)((Math.random() * (200+1)) - 100);
            System.out.println("Сгенерировано числа: " + "\na1 = " + a1
                    + "\nb1 = " + b1 + "\nВычисляется решение для Задания №4");
            compareNumbers(a1, b1);
        } else if (d == 5){
            int initValue = (int)((Math.random() * (200+1)) - 100);
            int delta = (int)((Math.random() * (200+1)) - 100);
            boolean increment = BoolRand();
            System.out.println("Сгенерированы значения для вычисления: " + "\ninitValue = " + initValue
                    + "\ndelta = " + delta
                    + "\nincrement = " + increment
                    + "\nВычисляется решение для Задания №5");
            addOrSubtractAndPrint(initValue, delta, increment);
        }
        System.out.println("\nВыполнение Задание №6 завершено.");
    }

    public static boolean BoolRand(){
        return new Random().nextBoolean();
    }

}
