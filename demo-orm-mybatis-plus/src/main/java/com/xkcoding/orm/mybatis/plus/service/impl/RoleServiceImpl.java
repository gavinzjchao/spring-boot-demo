package com.xkcoding.orm.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xkcoding.orm.mybatis.plus.entity.Role;
import com.xkcoding.orm.mybatis.plus.mapper.RoleMapper;
import com.xkcoding.orm.mybatis.plus.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper,Role> implements RoleService {

}
