package by.sonya.homework2;

import java.util.Scanner;

//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.

public class BookTask6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input digit: ");
        int digit = in.nextInt();

        int check = 0;

        for (int i = 1; i < digit; i++) {
            if (digit % i == 0) {
                check++;
            }
        }

        if(check > 1){
            System.out.println("The digit isn`t prime");
        }
        else{
            System.out.println("The digit is prime");
        }
        in.close();
    }
}
