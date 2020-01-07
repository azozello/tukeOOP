package structural.adapter;

public class Adapter extends NeededClass implements NeededInterface {

    public void combine() {
        classMethod();
        interfaceMethod();
    }

    public void interfaceMethod() {
        System.out.println("This is interface method");
    }
}
