package creational.singleton;

public class Singleton {
    private static Singleton value = new Singleton();

    private Singleton() {}

    public static Singleton getValue() {
        return value;
    }
}
