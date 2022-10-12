package by.sonya.homework2;

//7)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

public class Task29 {
    public static void main(String[] args) {

        int sum = 0; //переменная для хранения суммы чисел

        for(int i = 1; i <= 99; i += 2){
            sum += i;
        }

        System.out.printf("Сумма всех нечетных чисел от 1 до 99 равна: %d", sum);
    }
}
