package Interfac;


/*Д/з создать в проекте с Phone интерфейсы: Callable с методом receiveCall() и
Informable c default методом info() с default реализацией, применить интерфейсы
 к абстрактному классу Phone и классам-наследникам.*/

public class Main {
    public static void main(String[] args) {

       SamsungPhone Samsung = new SamsungPhone("9110000000", "S8", 200);
        XiaomiPhone Xiaomi = new XiaomiPhone("9210000000", "Mi5", 190);
        ApplePhone Apple = new ApplePhone("909000000", "14Pro", 210);

            // Вывод имени и номера телефона
       Samsung.RecieveCall("Alex");
       Samsung.info();
        Samsung.infoD();
        Xiaomi.RecieveCall("Dan");
        Xiaomi.info();
        Apple.RecieveCall("Nik");
        Apple.info();

        }
    }