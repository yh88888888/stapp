package ex01;

import lombok.Data;
import model.OrderOption;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderDetailDTO {
    private Integer orderId;
    private List<X> products;
    private Integer totalPrice;

    public OrderDetailDTO(List<OrderOption> orderOptions) { // p1(orOption1, orOption2), p2(orOption3)
        this.orderId = orderOptions.get(0).getOrder().getId();

        List<OrderOption> op1s = new ArrayList<>();
        op1s.add(orderOptions.get(0));
        op1s.add(orderOptions.get(1));

        List<OrderOption> op2s = new ArrayList<>();
        op2s.add(orderOptions.get(2));

        X x1 = new X(op1s);
        X x2 = new X(op2s);

        List<X> xList = new ArrayList<>();
        xList.add(x1);
        xList.add(x2);

        this.products = xList;
        this.totalPrice = 0;
        for (OrderOption op : orderOptions) {
            this.totalPrice += op.getTotalPrice();
        }
    }

    @Data
    public class X {
        private Integer productId;
        private List<Y> orderOptions;

        public X(List<OrderOption> orderOptions) {
            this.productId = orderOptions.get(0).getProduct().getId();
            List<Y> yList = new ArrayList<>();
            for (OrderOption orderOption : orderOptions) {
                yList.add(new Y(orderOption));
            }

            this.orderOptions = yList;
        }

        @Data
        public class Y {
            private Integer orderOptionId;
            private String orderOptionName;
            private Integer orderOptionQty;
            private Integer orderOptionTotalPrice;

            public Y(OrderOption orderOption) {
                this.orderOptionId = orderOption.getId();
                this.orderOptionName = orderOption.getOptionName();
                this.orderOptionQty = orderOption.getQty();
                this.orderOptionTotalPrice = orderOption.getTotalPrice();
            }
        }
    }
}