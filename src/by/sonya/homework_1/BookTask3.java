package by.sonya.homework_1;

//Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//        А) минут + секунд,
//        В) часов + минут + секунд,
//        С) дней + часов + минут + секунд,
//        D) недель + дней + часов + минут + секунд.
//        по аналогии с примером выше.

public class BookTask3 {
    public static void main(String[] args) {
        int timeInterval = 4500;
        int sec = 4500 % 60; //секунды
        int m = (timeInterval - sec) / 60;
        int min = m % 60; //минуты
        System.out.printf("A)%d минут %d секунд", min, sec);

        int h = (m - min) / 60;
        int hour = h % 24; // часы
        System.out.printf("\nB)%d часов %d минут %d секунд", hour, min, sec);

        int day = (h - hour) / 24 % 7; // отнимаем часы, делим на 24 часа и оставляем остаток от деления на 7 дней (неделя)
        System.out.printf("\nC)%d дней %d часов %d минут %d секунд", day, hour, min, sec);

        int week = (h - hour) / 24 / 7; // отнимаем часы, делим на 24 часа и оставляем число, получившееся от деления на 7 (неделя)
        System.out.printf("\nД)%d недель %d дней %d часов %d минут %d секунд",  week, day, hour, min, sec);
    }
}
