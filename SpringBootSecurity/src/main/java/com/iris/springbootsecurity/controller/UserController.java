package com.iris.springbootsecurity.controller;

import com.iris.springbootsecurity.entity.SysUser;
import com.iris.springbootsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PreAuthorize("hasAuthority('UserIndex')")
    @GetMapping("/index")
    public String index(){
        return "/user/index";
    }

    @RequestMapping("/hi")
    @ResponseBody
    public String hi(){
        SysUser user=userService.getUserByName("zhangsan");
        return user.toString();
    }

}
