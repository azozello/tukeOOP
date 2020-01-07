package structural.facade;

public class Shop {

    private Cheese cheese;
    private IPhone iPhone;

    public Shop() {
        this.cheese = new Cheese();
        this.iPhone = new IPhone();
    }

    public String buyIPhone() {
        return this.iPhone.boughtItemName();
    }

    public String buyCheese() {
        return this.cheese.boughtItemName();
    }
}
