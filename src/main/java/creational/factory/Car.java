package creational.factory;

public abstract class Car {

    protected double maxSpeed;
    abstract double getMaxSpeed();

    public void printName() {
        System.out.println("Just car");
    }
}
