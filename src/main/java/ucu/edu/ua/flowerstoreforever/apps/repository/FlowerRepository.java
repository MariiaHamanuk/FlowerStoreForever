package ucu.edu.ua.flowerstoreforever.apps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ucu.edu.ua.flowerstoreforever.apps.flower.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Repository>{

}
