package Gener;

/* Д/з изменить в проекте с Phone интерфейсы Callable и Informable на использование generic,
применить интерфейсы к абстрактному классу Phone и классам-наследникам. */

public interface Informable<T> {
          default void infoD()
          {
             System.out.println("Информация о телефоне отсутствует");
    }
}