package by.sonya.homework2;

//1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму на 10%
//нормы предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней?

public class Task23 {
    public static void main(String[] args) {

        float firstDay = 10;

        for(int i = 1; i < 7; i++){
            firstDay += firstDay * 0.10;
        }

        System.out.printf("За 7 дней спортсмен пробежит %.3f км", firstDay);
    }

}
