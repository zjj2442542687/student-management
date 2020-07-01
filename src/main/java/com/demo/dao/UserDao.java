package com.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.mapstruct.Mapper;
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
     * @return 受影响的条数
     */
    @Insert("insert into " + table + "(userName, password, phoneNumber, nickName) values(#{}, #{}, #{})")
    int insert();
}
