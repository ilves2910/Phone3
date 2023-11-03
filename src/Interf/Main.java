package Interf;

import javax.naming.Name;

/*Д/з создать в проекте с Phone интерфейсы: Callable с методом receiveCall() и
Informable c default методом info() с default реализацией, применить интерфейсы
 к абстрактному классу Phone и классам-наследникам.*/
public class Main {
    public static void main(String[] args) {

        //    ApplePhone phone = new ApplePhone("999-999-999","Samsung S55", 100.123);
        //        phone.receiveCall("Misha");
        //        phone.info();
        //        //phone.receiveCall();
        //        phone.infoD();
        //    }
      SamsungPhone Samsung = new SamsungPhone("9110000000", "Samsung S8", 200,"Alex");
      XiaomiPhone Xiaomi = new XiaomiPhone("9210000000", "Xiaomi Mi5", 190,"Dan");
      ApplePhone Apple = new ApplePhone("909000000", "Iphone 14Pro", 210, "Nik");

       Samsung.receivecall(Samsung.getName());
       Samsung.info();
        Samsung.infoD();
        Xiaomi.receivecall(Xiaomi.getName());
        Xiaomi.info();
        Xiaomi.infoD();
        Apple.receivecall(Apple.getName());
        Apple.info();
        Apple.infoD();

        }
    }