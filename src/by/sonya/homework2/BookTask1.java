package by.sonya.homework2;

import java.util.Scanner;

//Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.

public class BookTask1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое число: ");
        int number = in.nextInt();

        if(number / 10 != 0 & number / 100 != 0 & number / 1000 == 0){
            System.out.println("Число трехзначное");
        }
        else{
            System.out.println("Число не трехзначное");
        }

        if(number % 10 == 7){
            System.out.println("Последняя цифра числа 7");
        }
        else{
            System.out.println("Последняя цифра числа не 7");
        }

        if(number % 2 == 0){
            System.out.println("Число четное");
        }
        else{
            System.out.println("Число не четное");
        }
        in.close();
    }
}
