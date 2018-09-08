package com.test.demo;

import com.test.demo.entity.Users;
import com.test.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        /*Users u =new Users(3,"xiaobai","123456");
        Users login = userService.login(u);
        System.out.println(login);*/

    }

}
