package ucu.edu.ua.flowerstoreforever.apps.decorator;

import ucu.edu.ua.flowerstoreforever.apps.flower.Flower;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice(){
        return item.getPrice() * 2;
    }
    
    @Override
    public String getDescription() {
        return item.getFlowerType()  + " is in paper!";
    }
}
