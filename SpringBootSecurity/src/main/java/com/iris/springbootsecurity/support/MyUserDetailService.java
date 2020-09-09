package com.iris.springbootsecurity.support;

import com.iris.springbootsecurity.entity.SysPermission;
import com.iris.springbootsecurity.entity.SysRole;
import com.iris.springbootsecurity.entity.SysUser;
import com.iris.springbootsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = userService.getUserByName(s);
        if (null == user) {
            throw new UsernameNotFoundException(s);
        }

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (SysRole role :
                user.getRoleList()) {
            for (SysPermission permission :
                    role.getPermissionList()) {
                authorities.add(new SimpleGrantedAuthority(permission.getCode()));
            }
        }
        return new User(user.getUsername(), user.getPassword(), authorities);
    }
}
