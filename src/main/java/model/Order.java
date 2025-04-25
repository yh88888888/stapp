package model;

import lombok.Builder;
import lombok.Data;

//주문 주문번호1번, 2번
//주문 옵션 (바지 XL , 티 L)
//1대 N 여러개를 한꺼번에 장바구니에 담아서 구매
@Data
public class Order {
    private int id;

    @Builder
    public Order(int id) {
        this.id = id;
    }
}