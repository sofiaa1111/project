package by.sonya.homework2;

import java.util.Scanner;

//Пользователь вводит целое число. Если число чётное, то к нему прибавить 2, а если нечётное, то 1.
//Не использовать условие "если" (if).

public class Task13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int number = in.nextInt();

        int sum = 0; //переменная для суммирования

        switch (number % 2){
            case 0:
                sum = number + 2;
                break;
            default:
                sum = number + 1;
                break;
        }
        System.out.printf("Итоговое число: %d", sum);
        in.close();
    }
}
