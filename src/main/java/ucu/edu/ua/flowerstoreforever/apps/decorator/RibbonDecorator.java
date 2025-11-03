package ucu.edu.ua.flowerstoreforever.apps.decorator;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0; // Add ribbon price
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " is in ribbon!";
    }
}