package com.xkcoding.orm.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xkcoding.orm.mybatis.plus.entity.User;
import com.xkcoding.orm.mybatis.plus.mapper.UserMapper;
import com.xkcoding.orm.mybatis.plus.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * User Service
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-08 18:10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public List<User> listAllByPhone(String phone) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("phone_number", phone);
        return baseMapper.selectList(wrapper);
    }

    @Override
    public List<User> listAllByPhone2(String phone) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("phone_number", phone);
        return this.list(wrapper);

    }

    @Override
    public List<User> listAllByPhone3(String phone) {
        return baseMapper.selectAllByPhone(phone);
    }
}
