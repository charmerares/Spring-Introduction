package com.iris.springbootsecurity.service;

import com.iris.springbootsecurity.entity.SysUser;

public interface UserService {
    SysUser getUserByName(String username);
}
