package com.practice.notify;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {
    @Test
    void sendOk() {
        var svc = new NotificationServiceImpl();
        assertTrue(svc.send("USR-1","bienvenido"));
        assertFalse(svc.send("USR-1",""));
    }
}
