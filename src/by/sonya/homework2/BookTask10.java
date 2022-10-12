package by.sonya.homework2;

import java.util.Random;

//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).

public class BookTask10 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = random.ints(10, 1, 20).toArray();

        System.out.print("Array: " );
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Reverse array: ");
        int[] reverseArray = new int[array.length];

        int j = 0;

        for(int i = array.length - 1; i >= 0; i--){
            reverseArray[j++] = array[i];
            System.out.print(array[i] + " ");
        }
    }
}
