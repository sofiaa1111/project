package by.sonya.homework2;

import java.util.Scanner;

//Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа.
//А программа сранивает два введенных числа и выводит на консоль результат сравнения
//(два числа равны, первое число больше второго или первое число меньше второго).

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstNumber = in.nextInt();

        System.out.println("Input second number: ");
        int secondNumber = in.nextInt();

        if(firstNumber > secondNumber){
            System.out.println("The first number is greater than the second");
        }
        else if(firstNumber < secondNumber){
            System.out.println("The first number is less than the second");
        }
        else{
            System.out.println("The first number is equal to the second");
        }
        in.close();
    }
}
