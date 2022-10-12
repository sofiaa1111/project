package by.sonya.homework2;

import java.util.Scanner;

//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
//1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число от 1 до 3:");
        int number = in.nextInt();

        if (number == 1){
            System.out.println("Вы ввели цифру 1");
        }
        else if(number == 2){
            System.out.println("Вы ввели цифру 2");
        }
        else if(number == 3){
            System.out.println("Вы ввели цифру 3");
        }
        else{
            System.out.println("Вы ввели цифру не равную 1/2/3");
        }
        in.close();
    }
}
