package com.sangeng.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class AdminUserInfoVo {
    //用户权限信息
    private List<String> permissions;
    //用户角色信息
    private List<String> roles;
    //用户信息
    private UserInfoVo user;
}
