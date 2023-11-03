package Interf;


//public class ApplePhone extends Phone{
//
//    public ApplePhone(String number, String model, double weight) {
//        super(number, model, weight);
//    }
//
//    public void info(){
//        System.out.printf("Phone: model=%s, number=%s, weight=%.2f\n", this.getModel(), this.getNumber(), this.getWeight());
//    }
//}
public class ApplePhone extends Phone{
    public ApplePhone(String number, String model, int weight, String Name)
    {
        super(number, model, weight, Name);
    }

    public void info(){
        System.out.printf("Phone: model = %s, number = %s, weight = %d\n", this.getModel(), this.getNumber(), this.getWeight());
    }

}