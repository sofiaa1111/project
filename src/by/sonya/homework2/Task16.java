package by.sonya.homework2;

import java.util.Scanner;

//1)В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//Например, "это однозначное положительное число". Достаточно будет определить, является ли число однозначным,
//двузначным или трехзначным и более.

public class Task16 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        if((number % 10) == number){
            System.out.print("Это однозначное ");
        }
        else if((number % 100) == number){
            System.out.print("Это двухзначное ");
        }
        else if((number % 1000) == number){
            System.out.print("Это трехзначное ");
        }
        else{
            System.out.print("Это более чем трехзначное ");
        }

        if (number < 0){
            System.out.print("отрицательное число");
        }
        else{
            System.out.print("положительное число");
        }
        in.close();
    }
}

