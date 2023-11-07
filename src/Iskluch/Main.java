package Iskluch;


/* Д/з добавить в проект Phone свой класс NameException, исправим метод receiveCall получаем имя
 от пользователя и получаем исключение, если длина имени меньше 4 символов. */

import javax.naming.Name;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NameException {

        SamsungPhone Samsung = new SamsungPhone("9110000000", "S8", 200);
        XiaomiPhone Xiaomi = new XiaomiPhone("9210000000", "Mi5", 190);
        ApplePhone Apple = new ApplePhone("909000000", "14Pro", 210);

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя пользователя Samsung: ");
            String Name1 = scanner.nextLine();

            Samsung.RecieveCall(Name1);
            Samsung.info();
            Samsung.infoD();
        } catch (
                NameException exception) {
            System.out.println(exception.getMessage());
        }

            try {
                Scanner scanner1 = new Scanner(System.in);
                           System.out.println("Введите имя пользователя Xiaomi: ");
            String Name2 = scanner1.nextLine();
            Xiaomi.RecieveCall(Name2);
            Xiaomi.info();
            } catch (
                    NameException exception) {
                System.out.println(exception.getMessage());
            }

           try { Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите имя пользователя Apple: ");
            String Name3 = scanner2.nextLine();
            Apple.RecieveCall(Name3);
            Apple.info();

        } catch (
                NameException exception) {
            System.out.println(exception.getMessage());
        }

    }
}

