package com.practice.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    @Test
    void createAndExists() {
        var svc = new UserServiceImpl();
        String id = svc.createUser("jeisson","jeisson@mail.com");
        assertNotNull(id);
        assertTrue(svc.exists("jeisson@mail.com"));
    }
}