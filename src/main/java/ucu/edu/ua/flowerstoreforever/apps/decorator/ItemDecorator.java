package ucu.edu.ua.flowerstoreforever.apps.decorator;

// This is your abstract decorator
public abstract class ItemDecorator implements Item {
    
    // 1. It must wrap an Item, not a Flower
    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    // 2. It overrides getPrice() and delegates to the wrapped item
    @Override
    public double getPrice() {
        return item.getPrice();
    }

    // 3. It overrides getDescription() and delegates
    @Override
    public String getDescription() {
        return item.getDescription();
    }
}