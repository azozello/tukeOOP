package pasha.builder;

public class Director {

    public static void main(String[] args) {
        Product sedlak = new ConcreteBuilder1().setA("a").setB("b").setC("c").build();
        System.out.println(sedlak);
    }
}
