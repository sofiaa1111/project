package by.sonya.homework2;

import java.util.Scanner;

//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//полностью закрыть круглой картонкой радиусом r.

public class BookTask2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размеры сторон прямоугольного отверствия: ");
        int storonaA = in.nextInt();
        int storonaB = in.nextInt();

        System.out.println("Введите радиус круглой картонки: ");
        int radius = in.nextInt();

        int diagonalPrymougolnika;
        diagonalPrymougolnika = storonaA * storonaA + storonaB * storonaB;

        int diametrKruga;
        diametrKruga = radius * 2;

        if(diametrKruga == diagonalPrymougolnika || diametrKruga > diagonalPrymougolnika){
            System.out.println("Данной картонкой можно закрыть данное отверстие");
        }
        else{
            System.out.println("Данной картонкой нельзя закрыть данное отверстие");
        }
        in.close();
    }
}
