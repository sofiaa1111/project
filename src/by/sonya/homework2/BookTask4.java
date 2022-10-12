package by.sonya.homework2;

//double averageSum = 0;
//        double sum = 0;
//        int n = 0;
//        int x = (int)(Math.random() * 20);
//        while(x != 0) {
//        sum += x;
//        n ++;
//        x = (int)(Math.random()*20);
//        }
//        if(n != 0){
//        averageSum = sum / n;
//        } else {
//        averageSum = 0;
//        }
//        System.out.println("среднее:" + averageSum);
//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.

public class BookTask4 {
        public static void main(String[] args) {

                long sum = 1; //переменная для хранения факториала
                int n = 1;  //счетчик цифр в факториале

                int x = (int) (Math.random() * 20);
                System.out.println(x);

                if (x > 0) {
                        while (n <= x) {
                                sum *= n;
                                n++;
                        }

                        if (x == 0) {
                                System.out.printf("Факториал числа %d равен %d", x, sum);

                        }
                }
                System.out.printf("Факториал числа %d равен %d", x, sum);
        }
}
