package by.sonya.homework2;

import java.util.Scanner;

//4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

public class Task19 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int check = 0; //счетчик введенных чисел
        int counter = 0; //счетчик положительных чисел

        System.out.println("Введите три целых числа: ");

        do {
            int number = in.nextInt();
            check++;

            if(number > 0){
                counter++;
            }
        }
        while (check != 3);

        System.out.println("Количество положительных чисел в исходном наборе: " + counter);
        in.close();
    }
}