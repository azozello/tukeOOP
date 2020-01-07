package structural.decorator;

public abstract class BaseDecorator extends BaseImplementation {
    private BaseImplementation baseImplementation;

    public BaseDecorator(BaseImplementation baseImplementation) {
        this.baseImplementation = baseImplementation;
    }

    @Override
    public String getCity() {
        return this.baseImplementation.getCity();
    }
}
