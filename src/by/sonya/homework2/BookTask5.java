package by.sonya.homework2;

import java.util.Scanner;

//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class BookTask5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int digit;
        int factorial = 1;

        System.out.println("Введите число от 10 до 15: ");

        while(true){
            digit = in.nextInt();
            if(digit < 10 || digit > 15){
                System.out.println("Число не входит в диапозон допустимых значений, повторите ввод: ");
            }
            else{
                break;
            }
        }

        for(int i = 1; i <= digit; i++){
            factorial *= i;
        }
        System.out.printf("Факториал числа %d равен: %d", digit, factorial);
        in.close();
    }
}
