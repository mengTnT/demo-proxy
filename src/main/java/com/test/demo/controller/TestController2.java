package com.test.demo.controller;

import com.test.demo.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author NBUG
 * @date 2018/6/17 11:44
 */
@Controller
public class TestController2 {
    @RequestMapping("/test111")
    public String test(Map map) {
        Users users = new Users(1, "1111", "123", 20, "11111");
        map.put("user", users);
        return "index";

    }
}
