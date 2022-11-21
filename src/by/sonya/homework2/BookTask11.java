package by.sonya.homework2;

import java.util.Random;

//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.

public class BookTask11 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = random.ints(10, 1, 20).toArray();

        int sum = 0;

        int min = getMin(array); //переменная для хранения минимального значения массива
        int max = getMax(array); //переменная для хранения максимального значения массива

        int indexOfMin = findIndex(array, min); //переменая для хранения индекса минимального значения массива
        int indexOfMax = findIndex(array, max); //переменная для хранения индекса максимального значения массива

        //массив
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //суммирование значений между минимальным и максимальным значением массива, при условии,
        //что минимальный элемент левее максимального
        if (indexOfMin < indexOfMax) {
            for (int j = indexOfMin + 1; j <= indexOfMax - 1; j++) {
                sum += array[j];
            }
        }
        //суммирование значений между минимальным и максимальным значением, при условии,
        //что минимальный элемент правее максимального
        else {
            for (int j = indexOfMax + 1; j <= indexOfMin - 1; j++) {
                sum += array[j];
            }
        }
            System.out.println();
            System.out.printf("Max: %d", max);
            System.out.printf("\nMin: %d", min);
            System.out.printf("\nThe sum of the elements between the minimum and maximum is: %d\n", sum);
        System.out.println("indexMIN: " + indexOfMin);
        System.out.println("indexMAX: " + indexOfMax);
        }

        //метод для нахождения максимального значений массива
        public static int getMax ( int[] inputArray){

            int maxValue = inputArray[0]; //переменная для хранения максимального значения массива

            //массив
            for (int i = 1; i < inputArray.length; i++) {

                //если элемент массива больше данного максимального
                //то присваиваем значение элемента нашему максимальному
                if (inputArray[i] > maxValue) {
                    maxValue = inputArray[i];
                }
            }
            return maxValue;
        }

        //метод для нахождения минимального значения массива
        public static int getMin ( int[] inputArray){

            int minValue = inputArray[0]; //переменная для хранения минимального значения массива

            //массив
            for (int i = 1; i < inputArray.length; i++) {

                //если элемент массива меньше данного минимального, то присваиваем
                //значение этого элемента нашему минимальному
                if (inputArray[i] < minValue) {
                    minValue = inputArray[i];
                }
            }
            return minValue;
        }

        //метод для нахожденпия индекса нужного элемента массива
        public static int findIndex ( int array[], int t){

            //если массива равен нулю
            if (array == null) {
                return -1;
            }

            //находим длину массива
            int len = array.length;
            int i = 0;

            //перемещение в массиве
            while (i < len) {

                //если i равен t
                //то возвращаем индекс
                if (array[i] == t) {
                    return i;
                } else {
                    i = i + 1;
                }
            }
            return -1;
        }
    }



