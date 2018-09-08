package com.test.demo.controller;


import com.test.demo.entity.Users;
import com.test.demo.service.TestProxyService;
import com.test.demo.service.impl.TestProxyServiceImpl;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class TestController {
    @RequestMapping("/get")
    public String getString() {
        String name = "imooc";
        String password = "123456";
        log.debug("debug...");
        log.info("name: " + name + " ,password: " + password);
        log.info("name: {}, password: {}", name, password);
        log.error("error...");
        log.warn("warn...");

        return "HELLOWORLD";
    }

    @RequestMapping("/testAop")
    public void testAop() {
        Map map = new HashMap();

        System.out.println("我是方法执行的结果");
    }

    //测试热部署
    @RequestMapping("/testHot")
    public void testHot() {

        System.out.println("热部署");
        System.out.println("热部署");
        System.out.println("热部署");
        System.out.println("热部署");
        System.out.println("热部署");

    }

   /* public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //System.out.println(MyEnum.First.getMsg());
        *//*String s="ssss";
        Test<? super Number ,Integer> test=new Test();
        Object o="ss";
        test.test(0);*//*
        //test.test();

        List<Integer> list =new ArrayList();
        list.add(5);
        list.add(20);
        list.add(1);
        list.add(13);
        list.stream().filter(i->i>5).collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());

        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);





       *//* Class<? extends List> listClass = list.getClass();
        Method add = listClass.getDeclaredMethod("add", Object.class);
       add.invoke(list,1);*//*


    }*/

    public static void main(String[] args) {
   /*     //jdk动态代理

        TestProxyService testProxyService = new TestProxyServiceImpl();
        InvocationHandler invocationHandler = new MyInvocationHander(testProxyService);
        TestProxyService testProxyServiceProxy = (TestProxyService) Proxy.newProxyInstance(testProxyService.getClass().getClassLoader(),
                testProxyService.getClass().getInterfaces(), invocationHandler);
        System.out.println(testProxyServiceProxy.hello());*/

        CglibProxy cglibProxy = new CglibProxy();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(TestProxyServiceImpl.class);
        enhancer.setCallback(cglibProxy);

        TestProxyService testProxyService= (TestProxyService) enhancer.create();
        System.out.println(testProxyService.hello());

    }


}
