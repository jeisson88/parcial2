package test.java.com.practice.order;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    @Test
    void createIncrementsCounter() {
        var svc = new OrderServiceImpl();
        String id = svc.createOrder("USR-1","teclado",2);
        assertTrue(id.startsWith("ORD-USR-1-"));
        assertEquals(1, svc.getOrdersCount("USR-1"));
    }
}
