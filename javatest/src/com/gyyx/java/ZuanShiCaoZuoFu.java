package com.gyyx.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * des: 相当于自定义了一个hashset的子类, 可以重写hashset里面的方法
 * created by miapoeng on 2019/1/11 10:05
 */
public class ZuanShiCaoZuoFu {

    @Test
    public void test1 () {
        Set<String> hashSet = new HashSet<>() {
            //相当于自定义了一个hashset的子类
            //可以重写hashset里面的方法
        };

        List<Integer> list = new ArrayList<>() {
            {//定义了一个方法块
                add(1);
                add(2);
                add(3);
            }
        };

        list.forEach(System.out::println);
    }


}
