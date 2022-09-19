package by.sonya.homework1;

import java.util.Scanner;

//Изменить данный пример так, что бы при запуске программы ваша программа
//        выводила следующее: “Hello, <Ваше имя>!”.

public class BookTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();
        System.out.printf("Hello, %s!", name);
in.close();
         }
}
