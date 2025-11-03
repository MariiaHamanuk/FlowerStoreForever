package ucu.edu.ua.flowerstoreforever.apps.flower;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

// Import the Item interface
import ucu.edu.ua.flowerstoreforever.apps.decorator.Item;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Flowers")
public class Flower implements Item { // This "implements Item" is correct

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;   

    @Column(name = "price")
    private double price;
    
    @Column(name = "quantity")
    private int quantity;

    // --- THIS IS THE FIX ---
    // Manually add the setters your test needs
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // -----------------------

    // --- Methods from your last fix ---
    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.name;
    }
}