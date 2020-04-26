package ru.geekbrains.javafaststart.lesson_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите операцию от 1 до 4:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        while (operation < 1 || operation > 4){
            System.out.println("Введите операцию от 1 до 4:");
            operation = scanner.nextInt();
        }
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        double result;
        if(operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3){
            result = a * b;
        } else {
            result = a / ((double)b * 0.1);
                 // System.out.println("На ноль делить нельзя");
        } System.out.println("Результат = " + result);
    }
}
