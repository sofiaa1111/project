package by.sonya.homework2;

import java.util.Scanner;

//7)  В переменную записываете количество программистов. В зависимости от количества программистов необходимо вывести
//правильно окончание. Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.

public class Task22 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество: ");
        int number = in.nextInt();

        if(number == 0 || number % 10 > 4 & number / 10 != 0){
            System.out.println("программистов");
        }
        else if(number % 10 == 1){
            System.out.println("программист");
        }
        else{
            System.out.println("программиста");
        }
        in.close();
    }
}
