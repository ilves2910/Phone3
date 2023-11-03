package Interf;

public class SamsungPhone extends Phone {
    public SamsungPhone(String number, String model, int weight, String Name)
    {
        super(number, model, weight, Name);
    }

    public void info(){
        System.out.printf("Phone: model = %s, number = %s, weight = %d\n", this.getModel(), this.getNumber(), this.getWeight());
    }
}

