package by.sonya.homework2;

import java.util.Scanner;

//3) Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным,
//то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное число

public class Task18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = in.nextInt();

        if(number > 0){
            number += 1;
        }
        else if(number < 0){
            number -= 2;
        }
        else{
            number = 10;
        }

        System.out.print("Итоговое число: " + number);
        in.close();
    }
}
