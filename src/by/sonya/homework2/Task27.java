package by.sonya.homework2;

//5)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class Task27 {
    public static void main(String[] args) {

        double d = 2.54; //переменная для хранения одного дюйма
        double tabl = 0; //переменная для хранения таблицы

        for(int i = 1; i < 21; i++){
            for(int j = 1; j < i+1; j++){
                tabl = j*d;
            }

            System.out.println(i+" = " + tabl);
        }
    }
}
