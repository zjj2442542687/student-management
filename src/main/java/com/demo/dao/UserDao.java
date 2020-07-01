package com.demo.dao;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author ：dyx
 * @date :  2020/7/1 14:12
 * description ： 用户表的增删改查
 * version : 1.0
 */
@Mapper
@Component
public interface UserDao {
    String table = "t_user";

    /**
     * 插入一条数据
     */
    @Insert("insert into " + table + "(userName, password, phoneNumber) values(#{user.userName}, #{user.password}, #{user.phoneNumber})")
    @Options(useGeneratedKeys = true, keyProperty = "user.id")
    void insert(@Param("user") User user);
}
