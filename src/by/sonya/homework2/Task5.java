package by.sonya.homework2;

import  java.util.Scanner;

//Измените предыдущую программу. Пусть пользователь кроме номера операции вводит два числа,
//и в зависимости от номера операции с введенными числами выполняются определенные
//действия (например, при вводе числа 3 числа умножаются). Результат операции выводиться на консоль.

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNumber = in.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = in.nextInt();

        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");

        int numberOfOperation = in.nextInt();
        int operation = 0;

        switch (numberOfOperation){
            case 1:
                operation = firstNumber + secondNumber;
                break;
            case 2:
                operation = firstNumber - secondNumber;
                break;
            case 3:
                operation = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Операция неопределена");
                break;
        }

        //условие выполняется, если была введа возможная операция над числами
        if (numberOfOperation >=1 && numberOfOperation <=3) {
            System.out.printf("Результат операции равен: %d", operation);
        }
        in.close();
    }
}
