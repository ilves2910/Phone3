package Interf;

public abstract class Phone implements Callable, Informable {

    private String number;
    private String model;
    private int weight;
    private String Name;
/*
public Phone() {
        System.out.println("dz6.Phone is created");
    }

*/
    public String getName() {
        return Name;
    }

    public Phone(String number, String model, int weight, String Name)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.Name = Name;
    }

    // Конструктор с 3 параметрами
    public Phone(String number, String model, int weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с 2 параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    // Конструктор с одним параметром
    public Phone(String number) {
        this.number = "No number";
        this.model = "No model";
        this.weight = 0;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


       public void receivecall(String Name)
        {
            System.out.printf("Call: %s\n", Name);
        }

        public abstract void info();

}

