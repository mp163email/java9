package com.gyyx.java;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * des: 更方便的构造-只读的集合
 * created by miapoeng on 2019/1/11 15:28
 */
public class CollectRead {

    @Test
    public void test1 () {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);//只读的
        Set<Integer> integers1 = Set.of(1, 2, 3, 4, 5);
        Map<String, Integer> zhang = Map.of("zhang", 20, "wang", 21, "li", 22);
        zhang.forEach((k, v) -> System.out.println(k + "," + v));
        Map<String, Integer> stringIntegerMap = Map.ofEntries(Map.entry("zhang", 1), Map.entry("wang", 2));
        System.out.println(stringIntegerMap);
    }


}
