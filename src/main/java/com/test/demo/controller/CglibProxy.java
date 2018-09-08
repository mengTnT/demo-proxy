package com.test.demo.controller;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author NBUG
 * @date 2018/9/7 11:21
 */
public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        System.out.println("方法执行后");

        return invokeSuper;
    }
}
