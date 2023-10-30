package Abstract;

/* Д/з Класс Abstract.Phone.
Создайте класс Abstract.Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Abstract.Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Abstract.Phone, который принимает на вход три параметра для инициализации
переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных
класса - number, model.
Добавить конструктор без параметров.
*/

/*Д/3 Доработать класс Abstract.Phone. Сделать его абстрактным. Метод info() сделать абстрактным.
Также добавить классы-наследники от Abstract.Phone - Abstract.SamsungPhone, Abstract.XiaomiPhone и Abstract.ApplePhone.
Реализацию info() в каждом классе-наследнике. Создать объекты каждого класса-наследника и
проверить метод Info().*/
public class Main {
    public static void main(String[] args) {

       SamsungPhone Samsung = new SamsungPhone("9110000000", "S8", 200);
        XiaomiPhone Xiaomi = new XiaomiPhone("9210000000", "Mi5", 190);
        ApplePhone Apple = new ApplePhone("909000000", "14Pro", 210);

            // Вывод имени и номера телефона
       Samsung.RecieveCall("Alex");
       Samsung.info();

        Xiaomi.RecieveCall("Dan");
        Xiaomi.info();

        Apple.RecieveCall("Nik");
        Apple.info();

        }
    }