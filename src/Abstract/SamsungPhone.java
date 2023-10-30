package Abstract;

/*Д/3 Доработать класс Abstract.Phone. Сделать его абстрактным. Метод info() сделать абстрактным.
Также добавить классы-наследники от Abstract.Phone - Abstract.SamsungPhone, Abstract.XiaomiPhone и Abstract.ApplePhone.
Реализацию info() в каждом классе-наследнике. Создать объекты каждого класса-наследника и
проверить метод Info().*/
class SamsungPhone extends Phone {

       public SamsungPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    @Override
    public void info()
    {
        System.out.printf(getNumber() + " " + "Samsung " + getModel() + " " + "Weight " + getWeight() + "\n");
    }

    }

