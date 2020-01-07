package creational.factory;

public class CarFactory {

    public Car getCar(double money) {
        if (money > 1000000) {
            return new McLaren();
        } else if (money > 10000) {
            return new Lada();
        } else {
            System.out.println("Хуя ты нищий");
            return null;
        }
    }
}
