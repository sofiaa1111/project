package by.sonya.homework2;

import  java.util.Scanner;

//В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться.
//Напишите консольную программу, в которую пользователь вводит сумму вклада.
//Если сумма вклада меньше 100, то начисляется 5%. Если сумма вклада от 100 до 200, то начисляется 7%.
//Если сумма вклада больше 200, то начисляется 10%. В конце программа должна выводить
//сумму вклада с начисленными процентами.

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите сумму вклада: ");
        float depositAmount = in.nextFloat();

        if(depositAmount < 100){
            depositAmount += depositAmount * 0.05;
        }
        else if(depositAmount >= 100 && depositAmount <= 200){
            depositAmount += depositAmount * 0.07;
        }
        else{
            depositAmount += depositAmount * 0.1;
        }
        System.out.printf("Ваша сумма вклада составляет: %.2f", depositAmount);
        in.close();
    }
}
