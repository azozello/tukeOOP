package creational.abstractFactory;

public class FactoryCreator {

    public static AbstractFactory getFactory() {
        return new CarFactory();
    }
}
