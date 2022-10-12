package by.sonya.homework2;

//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.

import java.util.Random;

public class BookTask3 {
    public static void main(String[] args) {

        Random rand = new Random();

        int x = rand.nextInt();
        System.out.print(x);

        if(x % 10 == 1 || x % 10 == -1){
            System.out.print(" рубль");
        }
        else if(x % 10 == 2 || x % 10 == -2 || x % 10 == 3 || x % 10 == -3 || x % 10 == 4 || x % 10 == -4){
            System.out.print(" рубля");
        }
        else{
            System.out.print(" рублей");
        }
    }
}
