package by.sonya.homework2;

import java.util.Scanner;

//Пользователь вводит двузначное число. Найти число десятков данного числа.

public class Task10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите двухзначное число: ");
        int number = in.nextInt();

        System.out.println("Число десятков равно: " + number / 10);
        in.close();
    }
}
