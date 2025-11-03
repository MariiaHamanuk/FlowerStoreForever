package ucu.edu.ua.flowerstoreforever.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.ua.flowerstoreforever.apps.flower.Flower;
import ucu.edu.ua.flowerstoreforever.apps.service.FlowerService;


@RestController
// 1. Set the base URL for BOTH requests
@RequestMapping("/api/v1/flowers") 
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }

    // 2. This is now GET /api/v1/flowers
    @GetMapping
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }

    // 3. This is now POST /api/v1/flowers
    @PostMapping
    public Flower createFlower(@RequestBody Flower flower){
        return flowerService.createFlower(flower);
    }
}