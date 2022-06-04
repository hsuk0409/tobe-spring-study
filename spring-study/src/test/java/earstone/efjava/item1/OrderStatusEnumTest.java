package earstone.efjava.item1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.Map;

class OrderStatusEnumTest {

    @DisplayName("Enum 순회하며 모두 출력한다.")
    @Test
    void printAllOrderStatus() {

        for (OrderStatus orderStatus : OrderStatus.values()) {
            System.out.println(orderStatus);
        }
    }

    @DisplayName("Enum NULL 비교 시 == 연산자는 안전하다.")
    @Test
    void compareEnumToNullSafety() {
        OrderStatus newStatus = OrderStatus.NEW;
        OrderStatus deliveringStatus = OrderStatus.DELIVERING;
        OrderStatus nullStatus = null;

        if (nullStatus == newStatus) {
            System.out.println("Successfully compared");
        }

        if (newStatus == deliveringStatus) {
            System.out.println("Successfully compared");
        }

        String nullStr = null;
        String name = "justin";

        if (name == nullStr) {
            System.out.println("Successfully compared");
        }
    }

    @DisplayName("Enum NULL 비교 시 equals 연산자는 안전하지 않다.")
    @Test
    void compareEnumToNullNotSafety() {
        OrderStatus newStatus = OrderStatus.NEW;
        OrderStatus nullStatus = null;

        if (nullStatus.equals(newStatus)) {
            System.out.println("Successfully compared");
        }

    }

    @DisplayName("EnumMap 구현")
    @Test
    void enumMapTest() {
        Map<OrderStatus, String> orderStatusMap = new EnumMap<>(OrderStatus.class);
        orderStatusMap.put(OrderStatus.NEW, "신규주문");

        System.out.println(orderStatusMap.get(OrderStatus.NEW));
    }

}