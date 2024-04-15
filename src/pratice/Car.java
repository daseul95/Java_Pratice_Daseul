package pratice;

public class Car{
    public String model;
    public String color;
    public int fuel;

    public Car() {}

    public Car(String model,String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model,String color,int fuel) {
        this.model = model;
        this.color = color;
        this.fuel = fuel;
    }
}
