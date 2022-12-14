package com.sangeng.service;

import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
