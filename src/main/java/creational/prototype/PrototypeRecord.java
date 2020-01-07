package creational.prototype;

public class PrototypeRecord implements Prototype {

    private String name;

    public PrototypeRecord() {
    }

    public PrototypeRecord(String name) {
        this.name = name;
    }

    public Prototype getClone() {
        return new PrototypeRecord(name);
    }

    public String showIdentity() {
        return name;
    }

    public String getName() {
        return name;
    }
}
