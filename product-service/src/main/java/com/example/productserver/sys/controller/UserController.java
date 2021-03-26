package com.example.productserver.sys.controller;


import com.example.productserver.sys.entity.User;
import com.example.productserver.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author wangdh
 * @since 2020-12-16
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/insertUser")
    public boolean insertUser(@RequestBody User user){
        return userService.save(user);
    }
}

