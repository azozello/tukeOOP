package pasha.builder;

public class ConcreteBuilder1 implements Builder {

    private String a;
    private String b;
    private String c;

    public Builder setA(String a) {
        this.a = a;
        return this;
    }

    public Builder setB(String b) {
        this.b = b;
        return this;
    }

    public Builder setC(String c) {
        this.c = c;
        return this;
    }

    public Product build() {
        return new Product(this.a, this.b, this.c);
    }
}
