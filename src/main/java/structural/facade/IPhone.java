package structural.facade;

public class IPhone implements Buy {
    public String boughtItemName() {
        return "You have bought an iPhone.";
    }
}
