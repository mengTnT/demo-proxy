package com.test.demo.controller;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author NBUG
 * @date 2018/9/7 10:31
 */

public class MyInvocationHander implements InvocationHandler {

    private Object target;

    public MyInvocationHander(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("hello")){
            System.out.println("执行方法前");
            Object result = method.invoke(target, args);
            System.out.println("执行方法后");
            return result;
        }
        else {
          return   method.invoke(target,args);
        }

    }
}
