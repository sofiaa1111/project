package by.sonya.homework2;

import java.util.Scanner;

//5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

public class Task20 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int check = 0; //счетчик всех чисел
        int counter = 0; //счетчик положительных чисел
        int counterSecond = 0; //счетчик отрицательных чисел

        System.out.println("Введите три целых числа: ");

        do {
            int number = in.nextInt();
            check++;

            if(number > 0){
                counter++;
            }
            else if(number < 0){
                counterSecond++;
            }
        }
        while(check != 3);

        System.out.printf("Количесвто положительных чисел: %d\nКоличество отрицательных чисел: %d", counter, counterSecond);
        in.close();
    }
}
