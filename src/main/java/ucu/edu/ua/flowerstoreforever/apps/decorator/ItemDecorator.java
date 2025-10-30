package ucu.edu.ua.flowerstoreforever.apps.decorator;

import ucu.edu.ua.flowerstoreforever.apps.flower.Flower;

public abstract class ItemDecorator extends Flower{
    public Flower item;
    public ItemDecorator(Flower flower) {
        this.item = flower;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }
    
    public abstract String getDescription();
}
