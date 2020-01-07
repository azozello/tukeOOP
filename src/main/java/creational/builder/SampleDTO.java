package creational.builder;

public class SampleDTO {

    private String name;
    private double price;
    private int count;

    public SampleDTO() {
    }

    public SampleDTO(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public static final class Builder {
        private String name;
        private double price;
        private int count;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        public SampleDTO build() {
            return new SampleDTO(name, price, count);
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
