package com.kang.user.service;

import com.kang.user.entity.User;

/**
 * Created by kang on 16-5-30.
 */
public interface UserService {

    void addUser(User user);
    User getUserById(String id);

}

