package ucu.edu.ua.flowerstoreforever.apps.flower;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Flowers") // This matches your DBeaver screenshot
public class Flower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // This is a String, not a FlowerType Enum
    @Column(name = "name")
    private String name;

    // This is a String, not a FlowerColor Enum
    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private double price;
    
    @Column(name = "quantity")
    private int quantity;
}