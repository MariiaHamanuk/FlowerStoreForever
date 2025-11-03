package ucu.edu.ua.flowerstoreforever.apps.decorator;

import ucu.edu.ua.flowerstoreforever.apps.flower.Flower;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice(){
        return item.getPrice() * 3;
    }
    
    @Override
    public String getDescription() {
        return item.getName() + " is in basket!";
    }
}
