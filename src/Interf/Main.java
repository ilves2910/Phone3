package Interf;

/*Д/з создать в проекте с Phone интерфейсы: Callable с методом receiveCall() и
Informable c default методом info() с default реализацией, применить интерфейсы
 к абстрактному классу Phone и классам-наследникам.*/
public class Main {
    public static void main(String[] args) {

      SamsungPhone Samsung = new SamsungPhone("9110000000", "Samsung S8", 200,"Alex");
      XiaomiPhone Xiaomi = new XiaomiPhone("9210000000", "Xiaomi Mi5", 190,"Dan");
      ApplePhone Apple = new ApplePhone("909000000", "Iphone 14Pro", 210, "Nik");

       Samsung.receivecall();
       Samsung.info();
       Xiaomi.receivecall();
       Xiaomi.info();
       Apple.receivecall();
       Apple.info();


        }
    }