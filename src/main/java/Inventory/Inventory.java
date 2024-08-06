package Inventory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document (collection="inventory")
public class Inventory {
    @Id
    private String id;
    private String name;
    private String description;
    private int quantity;
    private double price;

    Inventory() {
    }

    Inventory(String id, String name, String description, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

}
