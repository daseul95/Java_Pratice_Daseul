package pratice;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("model3","black");

        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.fuel);

        Car gv80 = new Car("gv80","white",80);
        System.out.println(gv80.model);
        System.out.println(gv80.color);
        System.out.println(gv80.fuel);
    }

}
