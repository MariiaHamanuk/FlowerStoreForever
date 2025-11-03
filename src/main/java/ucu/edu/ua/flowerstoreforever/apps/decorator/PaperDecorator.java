package ucu.edu.ua.flowerstoreforever.apps.decorator;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10.0; // Add paper price
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " is in paper!";
    }
}