package by.sonya.homework1;

//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//        различны?

public class BookTask5 {
    public static void main(String[] args) {
        int x = 1233;
        System.out.println(x);
        int fourth_digit = 1234 % 10;
        int third_digit = 123 % 10;
        int second_digit = 12 % 10;
        int first_digit = 1 % 10;
        if(fourth_digit!=third_digit && fourth_digit!=second_digit && fourth_digit!=first_digit
                && third_digit!=second_digit && third_digit!=first_digit && second_digit!=first_digit){
            System.out.println("Верно! Все цифры числа различны.");
        }
        else{
            System.out.println("Не верно! Не все цифры числа различны.");
        }
    }
}
