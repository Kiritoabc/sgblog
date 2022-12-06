package com.sangeng.controller;


import com.sangeng.domain.ResponseResult;
import com.sangeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //获取用户信息
    @GetMapping("/userInfo")
    private ResponseResult userInfo(){
        return userService.userInfo();
    }

}
