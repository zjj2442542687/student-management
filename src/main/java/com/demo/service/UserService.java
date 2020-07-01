package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.pojo.User;
import com.demo.response.CommonsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    UserDao userDao;

    public CommonsResponse<User> insert(User user) {
        userDao.insert(user);
        return new CommonsResponse<>(
                user
        );
    }
}
