package ucu.edu.ua.flowerstoreforever.apps.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "flowers")
public class Flower{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;
}
