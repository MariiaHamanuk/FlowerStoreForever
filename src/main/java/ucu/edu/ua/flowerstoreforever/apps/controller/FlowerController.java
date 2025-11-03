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
@RequestMapping("/api/v1")
public class FlowerController {
    private FlowerService flowerService;
    @Autowired
    public FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }
    @GetMapping("api/v1")
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }
    @PostMapping("/flower")
    public Flower createFlower(@RequestBody Flower flower){
        return flowerService.createFlower(flower);
    }
}
