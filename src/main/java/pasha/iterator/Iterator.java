package pasha.iterator;

public interface Iterator {

    Object first();
    Object next();
    Object currentItem();
    boolean done();
}
