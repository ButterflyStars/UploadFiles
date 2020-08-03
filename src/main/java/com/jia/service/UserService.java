package com.jia.service;

import com.jia.pojo.User;

public interface UserService {

    User login(String username, String password);

    User findUserByName(String username);
}
