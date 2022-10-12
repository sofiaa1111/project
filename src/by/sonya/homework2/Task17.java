package by.sonya.homework2;

import java.util.Scanner;

//2) Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей. Определить существует ли такой треугольник.
//Дано: a, b, c –стороны предполагаемого треугольника. Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
//Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.

public class Task17 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

        System.out.println("Введите стороны треугольника: ");
        int storonaA = in.nextInt();
        int storonaB = in.nextInt();
        int storonaC = in.nextInt();

        if(storonaA < storonaC + storonaB & storonaC < storonaA + storonaB & storonaB < storonaC + storonaA){
            System.out.println("Такой треугольник существует!");
        }
        else{
            System.out.println("Такой треугольник не существует!");
        }
        in.close();
    }
}
