package com.test.demo.controller;

import lombok.Getter;

/**
 * @author NBUG
 * @date 2018/9/5 16:11
 */
@Getter
public enum MyEnum {
    First("1");
    private String msg;

    MyEnum(String msg) {
        this.msg = msg;
    }
}
