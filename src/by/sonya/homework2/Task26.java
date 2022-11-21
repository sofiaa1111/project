package by.sonya.homework2;

import java.util.Scanner;

//4)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

public class Task26 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите А:");
        int a = in.nextInt();

        System.out.print("Введите B:");
        int b = in.nextInt();

        int sum = 0;

        if(b >= a) {
            for (int i = b; i > 0; i--) {
                sum += a;
            }
        }
        else{
            for(int i = a; i > 0; i--){
                sum += b;
            }
        }

        System.out.println("А * В = " + sum);
        in.close();
    }
}

