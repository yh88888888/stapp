package ex01;

import lombok.Data;
import model.OrderOption;
@Data
public class ProductDTO {
    private int id;
    private String name;

    public ProductDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
