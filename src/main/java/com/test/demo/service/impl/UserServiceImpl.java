package com.test.demo.service.impl;

import com.test.demo.dao.UserDao;
import com.test.demo.entity.Users;
import com.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Users login(Users user) {
        return userDao.login(user);
    }
}
