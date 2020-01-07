package creational.factory;

public class McLaren extends Car {
    double getMaxSpeed() {
        return 380;
    }

    @Override
    public void printName() {
        System.out.println("McLaren");
    }
}
