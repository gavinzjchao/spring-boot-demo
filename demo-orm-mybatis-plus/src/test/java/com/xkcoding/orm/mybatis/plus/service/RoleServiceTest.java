package com.xkcoding.orm.mybatis.plus.service;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xkcoding.orm.mybatis.plus.SpringBootDemoOrmMybatisPlusApplicationTests;
import com.xkcoding.orm.mybatis.plus.entity.Role;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class RoleServiceTest extends SpringBootDemoOrmMybatisPlusApplicationTests {

    @Autowired
    private RoleService roleService;

    /**
    * @Description:
    * @Author: apei
    * @Date: 2021/11/19
    **/
    @Test
    public void testSelectAll(){
        List<Role> list = roleService.list(new QueryWrapper<>());
        Assert.assertTrue(CollUtil.isNotEmpty(list));
        log.debug("【list】= {}", list);
    }




}
