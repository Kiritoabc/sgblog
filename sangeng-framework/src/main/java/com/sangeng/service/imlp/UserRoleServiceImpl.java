package com.sangeng.service.imlp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sangeng.domain.entity.UserRole;
import com.sangeng.mapper.UserRoleMapper;
import com.sangeng.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户和角色关联表(UserRole)表服务实现类
 *
 * @author makejava
 * @since 2022-12-14 11:16:34
 */
@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}

