package by.sonya.homework2;

//3)Вычислить: 1+2+4+8+...+256

public class Task25 {
    public static void main(String[] args) {

         int sum = 0;//сумматор чисел

         for(int i =1; i <=256; i *= 2){
             sum += i;
         }
        System.out.println("Сумма выражения 1+2+4+8+...+256 равна : " + sum);
    }
}
