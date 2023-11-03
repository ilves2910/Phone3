package Interfac;

public class ApplePhone extends Phone {

    public ApplePhone(String number, String model, int weight) {

        super(number, model, weight);
    }

  //  @Override
    public void info() {
        //System.out.printf("Abstract.Phone: model=%s, number=%s, weight=%.2f\n", this.getModel(), this.getNumber(), this.getWeight());
        System.out.printf(getNumber() + " " + "Apple " + getModel() + " " + "Weight " + getWeight() + "\n");
    }
}