package ucu.edu.ua.flowerstoreforever.apps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucu.edu.ua.flowerstoreforever.apps.repository.FlowerRepository;
import ucu.edu.ua.flowerstoreforever.apps.flower.Flower;
import java.util.List;
@Service
public class FlowerService {
    private FlowerRepository flowRep;


    @Autowired
    public FlowerService(FlowerRepository flowRep){
        this.flowRep = flowRep;
    }

    public List<Flower> getFlowers() {
        return flowRep.findAll();
    }
    public Flower createFlower(Flower flower){
        return flowRep.save(flower);
    }
}
