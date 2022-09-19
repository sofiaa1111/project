//Изменить данный пример так, что бы при запуске программы ваша программа
//        выводила следующее: “Hello, <Ваше имя>!”.
package by.sonya.homework1;
import java.util.Scanner;
public class BookTask2 {
    public static <string> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();
        System.out.printf("Hello, %s!", name);



    }
}
