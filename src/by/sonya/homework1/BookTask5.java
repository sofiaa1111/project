package by.sonya.homework1;

//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//        различны?

public class BookTask5 {
    public static void main(String[] args) {
        int number = 1233;
        System.out.println(number);
        int fourthDigit = 1234 % 10;
        int thirdDigit = 123 % 10;
        int secondDigit = 12 % 10;
        int firstDigit = 1 % 10;
        if(fourthDigit!=thirdDigit && fourthDigit!=secondDigit && fourthDigit!=firstDigit
                && thirdDigit!=secondDigit && thirdDigit!=firstDigit && secondDigit!=firstDigit){
            System.out.println("Верно! Все цифры числа различны.");
        }
        else{
            System.out.println("Не верно! Не все цифры числа различны.");
        }
    }
}
