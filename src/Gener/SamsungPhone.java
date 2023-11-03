package Gener;

class SamsungPhone<S, S1, B> extends Phone {

       public SamsungPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

  
    public void info()
    {
        System.out.printf(getNumber() + " " + "Samsung " + getModel() + " " + "Weight " + getWeight() + "\n");
    }

    }

