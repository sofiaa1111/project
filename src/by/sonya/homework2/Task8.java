package by.sonya.homework2;

import java.util.Scanner;

//Необходимо написать программу, где бы пользователю предлагалось ввести число  1.
//Если пользователь ввёл число 1, программа должна вывести сообщение: "Вы ввели число 1".
//Если пользователь ввёл другое число, программа вообще ничего не должна делать.

public class Task8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число 1:");
        int number = in.nextInt();

        if(number == 1){
            System.out.println("Вы ввели число 1");
        }
        in.close();
    }
}
