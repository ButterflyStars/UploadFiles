package com.jia.mapper;

import com.jia.pojo.User;


public interface UserMapper {

    User login(String username, String password);

    User findUserByName(String username);
}
