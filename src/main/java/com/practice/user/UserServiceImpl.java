package com.practice.user;

import java.util.HashSet;
import java.util.Set;

public class UserServiceImpl implements IUserService {
    private final Set<String> emails = new HashSet<>();

    @Override
    public String createUser(String name, String email) {
        if (email == null || email.isBlank()) throw new IllegalArgumentException("email vacío");
        if (!emails.add(email)) throw new IllegalStateException("usuario ya existe");
        return "USR-" + Math.abs(email.hashCode());
    }

    @Override
    public boolean exists(String email) {
        return emails.contains(email);
    }
}
