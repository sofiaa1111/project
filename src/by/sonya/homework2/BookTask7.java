package by.sonya.homework2;

import java.util.Scanner;

//Найдите сумму первых n целых чисел, которые делятся на 3.

public class BookTask7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input the quantity of first numbers that will be divisible by 3: ");
        int quantity = in.nextInt();

        int sum = 0;

        for(int i = 3; i <= quantity * 3; i += 3){
            if(i % 3 == 0){
                sum += i;
            }
        }
        System.out.printf("Sum of first %d numbers that divicible by 3: %d", quantity, sum);
        in.close();
        }
    }
