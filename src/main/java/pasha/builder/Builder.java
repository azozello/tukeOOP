package pasha.builder;

public interface Builder {

    Builder setA(String a);
    Builder setB(String b);
    Builder setC(String c);

    Product build();
}
