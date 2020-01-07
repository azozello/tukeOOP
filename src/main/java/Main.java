import behavioral.chainOfResponsibility.DebugLogger;
import behavioral.chainOfResponsibility.ErrorLogger;
import behavioral.chainOfResponsibility.InfoLogger;
import behavioral.chainOfResponsibility.Logger;
import creational.abstractFactory.FactoryCreator;
import creational.builder.SampleDTO;
import creational.factory.CarFactory;
import creational.prototype.Prototype;
import creational.prototype.PrototypeRecord;
import creational.singleton.LazyLoadSingleton;
import creational.singleton.Singleton;
import structural.adapter.Adapter;
import structural.decorator.BaseImplementation;
import structural.decorator.DecoratorImplementation;
import structural.facade.Shop;
import structural.proxy.ProxyPortalGun;

public class Main {

    public static void main(String[] args) {
        Main.testCreational();
        Main.testStructural();
        Main.testBehavioral();
    }

    private static void testCreational() {
        System.out.println("Creational:\n");
        // use of Factory pattern
        CarFactory cf = new CarFactory();
        cf.getCar(2000000).printName();
        cf.getCar(20000).printName();

        System.out.println();

        // use of Abstract Factory pattern
        FactoryCreator.getFactory().getCar(2000000).printName();
        FactoryCreator.getFactory().getCar(20000).printName();

        System.out.println();

        // use of Singleton pattern
        Singleton one = Singleton.getValue();
        Singleton two = Singleton.getValue();

        System.out.println(one.equals(two));

        System.out.println();

        // use of LazyLoading singleton pattern
        LazyLoadSingleton lazyOne = LazyLoadSingleton.getValue();
        LazyLoadSingleton lazyTwo = LazyLoadSingleton.getValue();

        System.out.println(lazyOne.equals(lazyTwo));

        System.out.println();

        // use of Prototype pattern
        Prototype firstRecord = new PrototypeRecord("Pasha");
        Prototype secondRecord = firstRecord.getClone();

        System.out.println(firstRecord.showIdentity().equals(secondRecord.showIdentity()));

        System.out.println();

        // use of Builder pattern

        SampleDTO sampleDTO = new SampleDTO.Builder().setName("Name").setCount(13).setPrice(22.8).build();
        System.out.println(sampleDTO.getName());
        System.out.println(sampleDTO.getPrice());
        System.out.println(sampleDTO.getCount());

        System.out.println();
    }

    private static void testStructural() {
        System.out.println("Structural:\n");
        // use of adapter pattern
        Adapter adapter = new Adapter();
        adapter.combine();

        System.out.println();

        // use of decorator pattern
        BaseImplementation bi = new BaseImplementation();
        System.out.println(bi.getCity());
        DecoratorImplementation di = new DecoratorImplementation(bi);
        System.out.println(di.getCity());

        System.out.println();

        // use of facade pattern

        Shop shop = new Shop();
        System.out.println(shop.buyCheese());
        System.out.println(shop.buyIPhone());

        System.out.println();

        // use of proxy pattern
        ProxyPortalGun ricksGun = new ProxyPortalGun("Rick");
        ProxyPortalGun mortiesGun = new ProxyPortalGun("morty");
        ricksGun.relocate();
        mortiesGun.relocate();
        System.out.println();
    }

    private static void testBehavioral() {
        System.out.println("Behavioral:\n");

        // use of Chain of Responsibility pattern
        Logger mainLogger = new DebugLogger();
        Logger infoLogger = new InfoLogger();
        Logger errorLogger = new ErrorLogger();
        infoLogger.setNextLoggerLevel(errorLogger);
        mainLogger.setNextLoggerLevel(infoLogger);

        mainLogger.logMessage(1, "Hello 1");
        mainLogger.logMessage(2, "Hello 2");
        mainLogger.logMessage(3, "Hello 3");
    }
}
