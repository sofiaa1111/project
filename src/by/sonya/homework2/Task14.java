package by.sonya.homework2;

import java.util.Scanner;

//Нужно выяснить, находятся ли цифры в заданном числе в возрастающем порядке или нет (13569 - да, 132456 - нет).

public class Task14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int numberInput = in.nextInt();

        int num = numberInput % 10; //предыдущая цифра
        int check = 0; //переменная для сравнения

        numberInput /= 10; //уменьшение числа на цифру

        //пока число больеш нуля, проходимся по цифрам
        while (numberInput / 10 > 0) {

                if (numberInput % 10 >= num) {
                    check++; // в переменную сравнения добавляем единицу (выясняем что оно не подходит)
                }

            num = numberInput % 10; // присваивание переменной сравнения к предыдущей цифре
            numberInput /= 10; //уменьшаем число еще на одну цифру

        }

        //проверяем, если переменная check >= 1, то значит число не подходит
        if (check >=1){
            System.err.println("Нет");
        }
        else {
            System.out.println("Да");
        }
        in.close();
    }
}
