package com.test.demo.controller;

import lombok.Data;

/**
 * @author NBUG
 * @date 2018/9/5 16:39
 */
@Data
public class Test<T extends Number,E extends Number> {

    private String a="sssssssssss";



    private T data;


    public void test(T t){

        System.out.println(t);

    }

    public void num(E e){
        System.out.println(e);

    }



}
