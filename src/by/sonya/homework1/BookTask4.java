//Определить число, полученное выписыванием в обратном порядке цифр
//        любого 4-х значного натурального числа n.
package by.sonya.homework1;

public class BookTask4 {
    public static void main(String[] args) {
        int x = 1234; //number
        int q = 1234 % 10;
        int w = 123 % 10;
        int e = 12 % 10;
        int r = 1 % 10;
        System.out.println(x);
        System.out.printf("%d%d%d%d", q, w, e, r);

    }
}
