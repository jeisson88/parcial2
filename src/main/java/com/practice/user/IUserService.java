package com.practice.user;

public interface IUserService {
    String createUser(String name, String email);
    boolean exists(String email);
}
