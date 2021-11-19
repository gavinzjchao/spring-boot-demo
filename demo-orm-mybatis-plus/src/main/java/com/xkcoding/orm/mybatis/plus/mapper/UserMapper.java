package com.xkcoding.orm.mybatis.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xkcoding.orm.mybatis.plus.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * UserMapper
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-08 16:57
 */
@Component
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from orm_user where phone_number = #{phone}")
    List<User> selectAllByPhone(@Param("phone") String phone);

    List<User> selectAllByPhone2(@Param("phone") String phone);
}
