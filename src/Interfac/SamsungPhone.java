package Interfac;

class SamsungPhone extends Phone {

       public SamsungPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

   // @Override
    public void info()
    {
        System.out.printf(getNumber() + " " + "Samsung " + getModel() + " " + "Weight " + getWeight() + "\n");
    }

    }

