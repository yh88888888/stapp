package ex01;

import lombok.Data;

@Data
public class ProductDetailDTO {
    private int id;
    private String name;
    private int price;
    private int quantity;

    public ProductDetailDTO(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
