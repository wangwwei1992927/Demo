package com.example.demo;

import com.example.demo.fanxing.Apple;
import com.example.demo.fanxing.Food;
import com.example.demo.fanxing.Fruit;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 泛型的测试
 * @author: WangWei
 * @create: 2019-10-29 14:15
 */
public class FanxingTest {

    @Test
    public void test1(){
        /**
         * class Fruit extends Food{}
         * class Meat extends Food {}
         * class Apple extends Fruit{}
         * class Beef extends Meat{}
         * java中的泛型是不得变的
         * java的泛型中的通配符可以实现协变和逆变
         * 可以用 <? extends E>实现了协变
         * 第一种情况
         */
        List<? extends Food> foodList = new ArrayList<>();
        List<Apple> appleList = new ArrayList<>();
        // 这就是协变
        foodList = appleList;
        //错误 1
        //foodList.add(new Food());
        //错误 2
        //foodList.add(new Fruit());
        //错误 3
        //foodList.add(new Apple());
        //把子类的值 赋值给父类是 可以的
        Food food = foodList.get(0);
        /**
         * 第二种  逆变
         */
        List<? super Fruit> fruitList = new ArrayList<>();
        List<Food> foodList1 = new ArrayList<>();
        // 逆变
        fruitList = foodList1;
        foodList1.add(new Fruit());
        foodList1.add(new Apple());
        // get出来的是object类型的
        Object object = fruitList.get(0);
        Apple apple = (Apple)object;

    }

}
