package by.sonya.homework2;

import java.util.Random;

//Создать последовательность случайных чисел, найти и вывести наибольшее
//из них.

public class BookTask8 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = random.ints(10,25,50).toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        //сортировка массива пузырьком
        for(int start = 0; start < array.length - 1; start++){
            for(int index = 0; index < array.length - 1 - start; index++){
                if(array[index] > array[index + 1]){
                    int tmp = array[index];
                    array[index] = array[(index +1)];
                    array[(index + 1)] = tmp;
                }
            }
        }
            System.out.println("Наибольшее число в данном наборе: " + array[9]);
    }
}
