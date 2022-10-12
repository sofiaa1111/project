package by.sonya.homework2;

import java.util.Scanner;

//Пользователь вводит трёхзначное, четырёхзначное и т.д. число. Найти число десятков данного числа (вторую цифру справа).

public class Task11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое трехзначное/четырехзначное и т.д. число: ");
        int number = in.nextInt();

        System.out.println("Число десятков равно: " + number / 10 % 10);
        in.close();
    }
}
