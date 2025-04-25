package ex01;

import model.Order;
import model.OrderOption;
import model.Product;
import model.ProductOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        //판매자 로직!!!!!!!!!!!!!
        // 1. 상품 2개
        Product p1 = new Product(1, "바지");
        Product p2 = new Product(2, "티");
        List<Product> products = Arrays.asList(p1, p2); // 1번 문제 ->  List<Product> → List<ProductDTO>로 옮기

        // 2. 상품 옵션 4개 생성
        ProductOption op1 = new ProductOption(1, "파란바지", 1000, 10, p1);
        ProductOption op2 = new ProductOption(2, "빨간바지", 2000, 10, p1);
        ProductOption op3 = new ProductOption(3, "노랑티", 1000, 10, p2);
        ProductOption op4 = new ProductOption(4, "하얀티", 2000, 10, p2);

        List<ProductOption> p1Options = Arrays.asList(op1, op2);
        List<ProductOption> p2Options = Arrays.asList(op3, op4); // 2번 문제 -> p2, p2Options -> ProductDetailDTO 로 옮기기

        //구매자 로직!!!
        //3. 구매
        Order or1 = new Order(1);
        OrderOption orOption1 = new OrderOption(1, "파란바지", 2, 2000, p1, or1);
        OrderOption orOption2 = new OrderOption(2, "빨간바지", 2, 4000, p1, or1);
        OrderOption orOption3 = new OrderOption(3, "하얀티", 5, 10000, p2, or1);

        op1.setQty(op1.getQty() - 2);
        op2.setQty(op2.getQty() - 2);
        op4.setQty(op4.getQty() - 5);

        Order or2 = new Order(2);
        OrderOption orOption4 = new OrderOption(4, "노랑티", 7, 7000, p2, or2);

        op3.setQty(op3.getQty() - 7);

        // 1번 문제 : 상품 목록 화면
        // List<Product> -> List<ProductDTO>

        List<ProductDTO> productDTOs = new ArrayList<>();
        for (Product p : products) {
            productDTOs.add(
                    new ProductDTO(p.getId(), p.getName())
            );
        }

        // 2번 문제 : 상품 상세 화면 (p2)
        // Product(p2, p2Options) -> ProductDetail
        Product product = new Product();
        List<ProductDetailDTO> ProductDetailDTOs = new ArrayList<>();

        for (ProductOption po: productOptions){
            ProductDetailDTOs.add(new ProductOption(po.getId, po.getName, getPrice, getQty);
        }

        // 3번 문제 : 주문 확인 상세 화면 (or2)
        // 틀렸음 : DTO 담기


        // 4번 문제 : 주문 확인 상세 화면 (or1)
        // (orOption1, orOption2), (orOption3) -> OrderDetailDTO
    }
}
