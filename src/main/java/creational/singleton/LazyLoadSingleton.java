package creational.singleton;

public class LazyLoadSingleton {
    private static LazyLoadSingleton value;

    private LazyLoadSingleton() {}

    public static LazyLoadSingleton getValue() {
        if (value == null) {
            synchronized (LazyLoadSingleton.class) {
                if (value == null) {
                    value = new LazyLoadSingleton();
                }
                return value;
            }
        } else {
            return value;
        }
    }
}
