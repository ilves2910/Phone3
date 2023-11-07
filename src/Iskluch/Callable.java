package Iskluch;
/* Д/з добавить в проект Phone свой класс NameException, исправим метод receiveCall получаем имя
 от пользователя и получаем исключение, если длина имени меньше 4 символов. */
public interface Callable<T> {


   void RecieveCall(T Name) throws NameException;

}

