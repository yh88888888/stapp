package ex01;

import lombok.Data;
import model.OrderOption;
import model.Product;

@Data
public class ProductDTO {
    private int id;
    private String name;

//    public ProductDTO(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
    }
}
