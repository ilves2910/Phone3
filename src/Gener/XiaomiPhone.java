package Gener;

 class XiaomiPhone<S, S1, B> extends Phone {

    public XiaomiPhone(String number,String model,int weight) {
        super(number, model, weight);
    }


    public void info()
    {
        System.out.printf(getNumber() + " " + "Xiaomi " + getModel() + " " + "Weight " + getWeight() + "\n");
    }
}