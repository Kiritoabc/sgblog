package com.sangeng.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogUserLoginVo {
    /**
     * token
     * */
    private String token;

    /**
     * 用户的信息info
     * */
    private UserInfoVo userInfo;
}
