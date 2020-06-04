package com.example.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 描述
 * @author: Wangwei
 * @date: 2020/4/22 16:17
 */
@Slf4j
public class ExceptionTest {

    public static void main(String[] args) {
        ExceptionTest exception = new ExceptionTest();
        try {
            exception.m1();
        } catch (Throwable e) {
            log.info("c--{}", e.getCause());
            log.info("e--{}", e.toString());
            log.info("s--{}", e.getStackTrace());
        }

    }

    public void m1() {
        m2();
    }

    public void m2() {
        m3();
    }

    public void m3() {
        String name = null;
        System.out.println(name.length());
    }
}
