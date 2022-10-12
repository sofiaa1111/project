package by.sonya.homework2;

import java.util.Scanner;

//Напишите консольную программу, в которой пользователь вводит с клавиатуры число.
//Если число одновременно меньше 9
//и больше 2, то программа выводит "Число больше 2 и меньше 9".
//Иначе программа выводит сообщение "Неизвестное число".

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число :");
        int number = in.nextInt();

        if(number > 2 && number < 9){
            System.out.println("Число больше 2 и меньше 9");
        }
        else{
            System.out.println("Неизвестное число");
        }
        in.close();
    }

}
