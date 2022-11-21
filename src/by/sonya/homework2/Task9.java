package by.sonya.homework2;

import java.util.Scanner;

//Пользователь вводит целое число. Найти последнюю цифру.

public class Task9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        System.out.println("Последняя цифра числа: " + number % 10);
        in.close();
    }
}
