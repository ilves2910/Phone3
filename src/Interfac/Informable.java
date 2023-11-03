package Interfac;

/*Д/з создать в проекте с Phone интерфейсы: Callable с методом receiveCall() и
Informable c default методом info() с default реализацией, применить интерфейсы
 к абстрактному классу Phone и классам-наследникам.*/

public interface Informable {
          default void infoD()
          {
             System.out.println("Информация о телефоне отсутствует");
    }
}