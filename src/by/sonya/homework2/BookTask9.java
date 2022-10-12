package by.sonya.homework2;

import java.util.Random;
import java.util.*;


//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.

public class BookTask9 {
    public static void main(String[] args) {

        Random random = new Random();

        double sizeArray = (Math.random() * ((10 - 5) + 1)) + 5; //произвольная длина
        int[] array = random.ints((int) sizeArray, 1, 10).toArray();

        OptionalInt indexMax = Arrays.stream(array).max(); //переменная для хранения максимальной оценки
        OptionalInt indexMin = Arrays.stream(array).min(); //переменная для хранения минимальной оценки

        int c = array[0]; //переменная для хранения нулевого индекса массива
        int x = array[0]; //вторая переменная для хранения нулевого индекса массива
        int indMax = 0; //переменная для хранения индекса максимальной оценки
        int indMin = 0; //переменная для хранения индекса минимальной оценки

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

            //условия для индекса минимальной оценки
            if (x > array[i]) {
                x = array[i];
                indMin = i + 1;
            }

            if (indMin == 0) {
                indMin += 1;
            }

            //условия для индекса максимальной оценки
            if (c < array[i]){
                c = array[i];
                indMax = i + 1;
            }

            if(indMax == 0){
                indMax += 1;
            }
        }
        System.out.println();

        System.out.println("min: " + indMin + "\nmax: " + indMax);
        System.out.println("Максимальная оценка: " + indexMax);
        System.out.println("Минимальная оценка: " + indexMin);
        }
    }
