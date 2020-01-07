package creational.abstractFactory;

import creational.factory.Car;
import creational.factory.Lada;
import creational.factory.McLaren;

public class CarFactory extends AbstractFactory {
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
