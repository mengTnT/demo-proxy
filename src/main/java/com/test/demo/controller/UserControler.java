package com.test.demo.controller;

import com.test.demo.entity.Result;
import com.test.demo.entity.Users;
import com.test.demo.service.UserService;
import com.test.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserControler {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Users login(Users users) {

        Users u = userService.login(users);
        return u;
    }

    @RequestMapping("/getAllUsers")
    public List<Users> getAllUsers(Users users) {

        return null;
    }

    /**
     * @param users
     * @param bindingResult
     * @return
     */
    @PostMapping("/register")//这里验证User实体类中的注解
    public Result register(@Valid Users users, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //如果有错误，就打印里面的错误信息
            //System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtil.error(101, bindingResult.getFieldError().getDefaultMessage());

        }
        return ResultUtil.success(users);
    }

}
