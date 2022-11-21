package by.sonya.homework2;

import java.util.Scanner;

//Пользователь вводит трёхзначное число. Найти сумму цифр этого числа.

public class Task12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите трехзначное число: ");
        int number = in.nextInt();

        int units = number % 10;
        int dozens = number / 10 % 10;
        int hundreds = number / 100;
        int summa = units + dozens + hundreds;

        System.out.println("Сумма цифр этого числа равна: " + summa);
        in.close();
    }
}
