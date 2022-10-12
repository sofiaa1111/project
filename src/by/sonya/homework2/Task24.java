package by.sonya.homework2;

//2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class Task24 {
    public static void main(String[] args) {

        int ameba = 2;
        int check = 0;//счетчик для количества трехчасовых промежутков
        int itog = 0; //общее колмчество амеб за сутки

        for(int i = 3; i<=24; i+=3){
            check++;
        }

        itog += check * ameba;
        System.out.println("Через 3, 6, 9, 12, 15, 18, 21, 24 амеб будет соответсвенно: " + itog);
    }
}
