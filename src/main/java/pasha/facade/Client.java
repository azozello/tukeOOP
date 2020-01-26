package pasha.facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        Client.objednajIphone(facade);
        Client.objednajMacbook(facade);
        Client.objednajAppleWatch(facade);
    }

    private static void objednajIphone(Facade facade) {
        facade.objednaj("Pasha", "IPhone", 899.0, 1);
    }

    private static void objednajMacbook(Facade facade) {
        facade.objednaj("Pasha", "Macbook pro 15", 2599.0, 1);
    }

    private static void objednajAppleWatch(Facade facade) {
        facade.objednaj("Pasha", "Apple watch", 199.0, 1);
    }
}
