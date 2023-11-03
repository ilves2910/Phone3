package Gener;


/* Д/з изменить в проекте с Phone интерфейсы Callable и Informable на использование generic,
применить интерфейсы к абстрактному классу Phone и классам-наследникам. */

public class Main {
    public static void main(String[] args) {

       SamsungPhone<String,String,Integer> Samsung;
        Samsung = new SamsungPhone("9110000000", "S8", 200);
        XiaomiPhone<String,String,Integer> Xiaomi;
        Xiaomi = new XiaomiPhone("9210000000", "Mi5", 190);
        ApplePhone<String,String,Integer> Apple;
        Apple = new ApplePhone("909000000", "14Pro", 210);

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