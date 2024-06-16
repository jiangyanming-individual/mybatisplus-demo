package com.jiang.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.itheima.mp.domain.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Wrapper;


/**
 * 继承BaseMapper 被Spring 托管
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    void updateBySQL(@Param(Constants.WRAPPER) LambdaQueryWrapper<User> userLambdaQueryWrapper, @Param("amount") int amount);
}
