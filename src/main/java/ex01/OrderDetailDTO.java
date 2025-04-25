package ex01;

import lombok.Data;

@Data
public class OrderDetailDTO {
    private String id;
    private String name;
    private int price;
    private int quantity;

    public OrderDetailDTO(String id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
