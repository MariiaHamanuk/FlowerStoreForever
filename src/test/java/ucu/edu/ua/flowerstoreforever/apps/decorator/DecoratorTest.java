package ucu.edu.ua.flowerstoreforever.apps.decorator;



import org.junit.jupiter.api.Test;

import ucu.edu.ua.flowerstoreforever.apps.flower.Flower;
import ucu.edu.ua.flowerstoreforever.apps.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;



public class DecoratorTest {

    @Test
    public void testPaper() {
        Flower flower = new Flower();
        flower.setFlowerType(FlowerType.CHAMOMILE);

        flower.setPrice(10.0);

        ItemDecorator paperWrappedFlower = new PaperDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 20.0);
        assertEquals(paperWrappedFlower.getDescription(), flower.getFlowerType() +" is in paper!");   
    }

    @Test
    public void testBasket() {
        ucu.edu.ua.flowerstoreforever.apps.flower.Flower flower = new Flower();
        flower.setFlowerType(FlowerType.CHAMOMILE);
        flower.setPrice(10.0);

        ItemDecorator paperWrappedFlower = new BasketDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 30.0);
        assertEquals(paperWrappedFlower.getDescription(), flower.getFlowerType() +" is in basket!");     
    }

    @Test
    public void testRibbon() {
        ucu.edu.ua.flowerstoreforever.apps.flower.Flower flower = new Flower();
        flower.setFlowerType(FlowerType.CHAMOMILE);

        flower.setPrice(10.0);

        ItemDecorator paperWrappedFlower = new RibbonDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 15.0);
        assertEquals(paperWrappedFlower.getDescription(), flower.getFlowerType() +" is in ribbon!");     
 
    }
}