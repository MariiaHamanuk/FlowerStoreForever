package ucu.edu.ua.flowerstoreforever.apps.decorator;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20.0; // Add basket price
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " is in basket!";
    }
}