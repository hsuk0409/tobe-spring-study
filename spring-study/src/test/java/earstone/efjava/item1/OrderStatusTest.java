package earstone.efjava.item1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OrderStatusTest {

    @DisplayName("enum을 순회하며 모두 출력한다.")
    @Test
    void printAllOrderStatus() {

        for (OrderStatus orderStatus : OrderStatus.values()) {
            System.out.println(orderStatus);
        }
    }

}