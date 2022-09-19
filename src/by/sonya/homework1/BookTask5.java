//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//        различны?
package by.sonya.homework1;

public class BookTask5 {
    public static void main(String[] args) {
        int x = 1233;
        System.out.println(x);
        int q = 1233 % 10;
        int w = 123 % 10;
        int e = 12 % 10;
        int r = 1 % 10;
        if(e!=r && q!=w && w!=e && q!=e && q!=r && w!=r)
        {
            System.out.println("Верно! Все цифры числа различны.");
        }
        else
        {
            System.out.println("Не верно! Не все цифры числа различны.");
        }
    }
}
