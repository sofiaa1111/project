package by.sonya.homework_1;

//Определить число, полученное выписыванием в обратном порядке цифр
//        любого 4-х значного натурального числа n.

public class BookTask4 {
    public static void main(String[] args) {
        int number = 1234;
        int fourthDigit = 1234 % 10;
        int thirdDigit = 123 % 10;
        int secondDigit = 12 % 10;
        int firstDigit = 1 % 10;
        System.out.println(number);
        System.out.printf("%d%d%d%d", fourthDigit, thirdDigit, secondDigit, firstDigit);
    }
}

