package ucu.edu.ua.flowerstoreforever.apps.decorator;

import org.junit.jupiter.api.Test;
import ucu.edu.ua.flowerstoreforever.apps.flower.Flower;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    private static final String FLOWER_NAME = "Chamomile";

    @Test
    public void testPaper() {
        Flower flower = new Flower();
        // 1. Set the name as a String
        flower.setName(FLOWER_NAME);
        flower.setPrice(10.0);

        ItemDecorator paperWrappedFlower = new PaperDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 20.0);
        // 2. Assert using the String name
        assertEquals(paperWrappedFlower.getDescription(), FLOWER_NAME +" is in paper!");   
    }

    @Test
    public void testBasket() {
        Flower flower = new Flower();
        // 1. Set the name as a String
        flower.setName(FLOWER_NAME);
        flower.setPrice(10.0);

        ItemDecorator paperWrappedFlower = new BasketDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 30.0);
        // 2. Assert using the String name
        assertEquals(paperWrappedFlower.getDescription(), FLOWER_NAME +" is in basket!");     
    }

    @Test
    public void testRibbon() {
        Flower flower = new Flower();
        // 1. Set the name as a String
        flower.setName(FLOWER_NAME);
        flower.setPrice(10.0);

        ItemDecorator paperWrappedFlower = new RibbonDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 15.0);
        // 2. Assert using the String name
        assertEquals(paperWrappedFlower.getDescription(), FLOWER_NAME +" is in ribbon!");     
    }
}