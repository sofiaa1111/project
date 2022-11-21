package by.sonya.homework2;

import java.util.Random;
import java.util.Scanner;

//Попросите кота загадать число от 0 до 100. У вас будет семь попыток на угадывание.
//При каждой попытке вам будет выводиться сообщение - "Мало" или "Много". Если угадаете,
//уложившись в семь попыток, то выиграли. Если нет, то идёте кормить кота.
//
//Для генерации секретного числа используете код:
//
//Random random = new Random();
//int secret;
//Генерируем число от 0 до 100
//secret = random.nextInt(100 + 1);

public class Task15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int secret, number, check = 0;

        secret = random.nextInt(100 + 1); //Генерируем число от 0 до 100

        System.out.println("Угадайте число, которое загадал кот. У вас 7 попыток! Удачи)");

        do{
            number = in.nextInt();
            check++;

                if (number > secret) {
                    System.out.println("Много");
                }
                else if (number < secret) {
                    System.out.println("Мало");
                }
                else if (number == secret) {
                    System.out.println("Вы угадали число. Поздравляю!");
                }
        }
        while(check != 7);

        System.out.println("Вы не угадали число с семи попыток. Поэтому, идите кормить кота!)");
    }
}
