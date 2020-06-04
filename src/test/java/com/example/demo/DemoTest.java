package com.example.demo;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @description: ceshi
 * @author: WangWei
 * @create: 2019-10-31 13:42
 */
public class DemoTest extends TopTest {

    @Test
    public void test1() {
        /*Long a = null;
        System.out.println(a - 1);*/
        BigDecimal a = new BigDecimal(120.21);
        System.out.println("aa==" + a.intValue());
        BigDecimal b = new BigDecimal(120.00);
        System.out.println("bb==" + b.intValue());
    }

}
