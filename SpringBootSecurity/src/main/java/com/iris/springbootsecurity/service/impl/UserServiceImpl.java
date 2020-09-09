package com.iris.springbootsecurity.service.impl;

import com.iris.springbootsecurity.dao.UserDao;
import com.iris.springbootsecurity.entity.SysUser;
import com.iris.springbootsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
