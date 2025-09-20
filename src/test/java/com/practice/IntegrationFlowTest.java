package com.practice;

import com.practice.user.*;
import com.practice.order.*
;
import com.practice.notify.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegrationFlowTest {
    @Test
    void fullFlow() {
        var users = new UserServiceImpl();
        var orders = new OrderServiceImpl();
        var notify = new NotificationServiceImpl();

        String uid = users.createUser("Ana","ana@mail.com");
        String oid = orders.createOrder(uid,"mouse",1);
        boolean sent = notify.send(uid, "Pedido " + oid + " creado");

        assertTrue(users.exists("ana@mail.com"));
        assertEquals(1, orders.getOrdersCount(uid));
        assertTrue(sent);
    }
}
