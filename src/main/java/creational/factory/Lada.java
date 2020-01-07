package creational.factory;

public class Lada extends Car {
    double getMaxSpeed() {
        return 100;
    }

    @Override
    public void printName() {
        System.out.println("Lada");
    }
}
