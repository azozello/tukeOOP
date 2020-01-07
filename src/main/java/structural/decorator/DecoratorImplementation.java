package structural.decorator;

public class DecoratorImplementation extends BaseDecorator {
    public DecoratorImplementation(BaseImplementation baseImplementation) {
        super(baseImplementation);
    }

    @Override
    public String getCity() {
        return super.getCity() + "New-York";
    }
}
