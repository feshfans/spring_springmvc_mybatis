package com.kang.user.service.impl;

import com.kang.user.dao.UserMapper;
import com.kang.user.entity.User;
import com.kang.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by kang on 16-5-30.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.insert(user);
    }

    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
