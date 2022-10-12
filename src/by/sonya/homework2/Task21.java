package by.sonya.homework2;

import java.util.Scanner;

//6) Даны 2 числа. Вывести большее из них

public class Task21 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int numberFirst = in.nextInt();

        System.out.print("Введите второе число: ");
        int numberSecond = in.nextInt();

        if(numberFirst < numberSecond){
            System.out.printf("Большее из данных чисел: %d", numberSecond);
        }
        else if(numberFirst > numberSecond){
            System.out.printf("Большее из данных чисел: %d", numberFirst);
        }
        else{
            System.out.println("Числа равны");
        }
        in.close();
    }
}