package Gener;

/* Д/з изменить в проекте с Phone интерфейсы Callable и Informable на использование generic,
применить интерфейсы к абстрактному классу Phone и классам-наследникам. */

public abstract class Phone implements Callable<String>, Informable<String> {

    private String number;
    private String model;
    private int weight;

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

    public void RecieveCall(String Name)
    {
        System.out.printf("Звонит: %s\n", Name);
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

    public abstract void info();
}

