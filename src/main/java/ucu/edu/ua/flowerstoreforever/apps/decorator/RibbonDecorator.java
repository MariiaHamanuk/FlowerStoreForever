package ucu.edu.ua.flowerstoreforever.apps.decorator;

import ucu.edu.ua.flowerstoreforever.apps.flower.Flower;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice(){
        return item.getPrice() * 1.5;
    }
    
    @Override
    public String getDescription() {
        return item.getName()  + " is in ribbon!";
    }
}
