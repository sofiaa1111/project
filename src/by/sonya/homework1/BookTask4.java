package by.sonya.homework1;

//Определить число, полученное выписыванием в обратном порядке цифр
//        любого 4-х значного натурального числа n.

public class BookTask4 {
    public static void main(String[] args) {
        int number = 1234;
        int fourth_digit = 1234 % 10;
        int third_digit = 123 % 10;
        int second_digit = 12 % 10;
        int first_digit = 1 % 10;
        System.out.println(number);
        System.out.printf("%d%d%d%d", fourth_digit, third_digit, second_digit, first_digit);
    }
}
