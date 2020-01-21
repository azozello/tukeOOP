import behavioral.chainOfResponsibility.DebugLogger;
import behavioral.chainOfResponsibility.ErrorLogger;
import behavioral.chainOfResponsibility.InfoLogger;
import behavioral.chainOfResponsibility.Logger;
import behavioral.command.*;
import behavioral.iterator.Iterator;
import behavioral.iterator.NameContainer;
import behavioral.memento.CareTaker;
import behavioral.memento.Originator;
import behavioral.strategy.Context;
import behavioral.strategy.Downstairs;
import behavioral.strategy.Upstairs;
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

import java.util.HashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
//        String a = "abc".substring(0, 1);
//        String b = "a";
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//
//        System.out.println();
//
//        a = a.intern();
//        b = b.intern();
//
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//        Main.testCreational();
////        Main.testStructural();
////        Main.testBehavioral();


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

        System.out.println();

        // use of Command pattern
        Document doc = new Document();

        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();

        System.out.println();

        // use of Iterator pattern
        NameContainer nc = new NameContainer("Denys");
        Iterator nameIterator = nc.getIterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

        System.out.println();

        // use of Memento pattern
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));

        System.out.println();

        // use of Strategy pattern

        Context up = new Context(new Upstairs());
        Context down = new Context(new Downstairs());
        System.out.println(up.executeStrategy());
        System.out.println(down.executeStrategy());

        System.out.println();
    }
}
