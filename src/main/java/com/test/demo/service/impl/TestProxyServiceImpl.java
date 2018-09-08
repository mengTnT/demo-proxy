package com.test.demo.service.impl;

import com.test.demo.service.TestProxyService;

/**
 * @author NBUG
 * @date 2018/9/7 10:34
 */
public class TestProxyServiceImpl implements TestProxyService {
    @Override
    public String hello() {
        System.out.println("你好");
        return "你好1";
    }

    @Override
    public String hi() {
        return "你好2";
    }
}
