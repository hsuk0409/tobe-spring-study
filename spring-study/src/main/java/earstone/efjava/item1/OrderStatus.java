package earstone.efjava.item1;

import lombok.Getter;

@Getter
public enum OrderStatus {

    NEW("신규주문"),
    DISPATCH_WAITING("발송처리"),
    DELIVERING("배송중"),
    DELIVERED("배송완료")
    ;

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

}
