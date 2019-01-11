package com.gyyx.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * des: Stream中新增加的4个方法
 * created by miapoeng on 2019/1/11 15:50
 */
public class StreamTest {

    /**
     * takewhile-满足条件就输出，不满足就停止查找
     */
    @Test
    public void test1 () {
        List<Integer> list = Arrays.asList(11,23,70,33);
        list.stream().takeWhile(x -> x < 70).forEach(System.out::println);
    }

    /**
     * dropwhile-takewhile的补集
     */
    @Test
    public void test2 () {
        List<Integer> list = Arrays.asList(11,23,70,33);
        list.stream().dropWhile(x -> x < 70).forEach(System.out::println);
    }

    /**
     * iterator的使用
     */
    @Test
    public void test3 () {
        Stream.iterate(0, x -> x + 1).limit(10).forEach(System.out::println);//jdk8
        Stream.iterate(0, x -> x < 10, x -> x + 1).forEach(System.out::println);//jdk9
    }

    /**
     * Stream.ofNullable的使用
     */
    @Test
    public void test4 () {
        Stream<Integer> stream1 = Stream.ofNullable(1);
        System.out.println(stream1.count());
        Stream<Integer> stream2 = Stream.ofNullable(null);//jdk9, null不占个数，输出是0
        System.out.println(stream2.count());
    }

    /**
     * Optionnal转Stream
     */
    @Test
    public void test5 () {
        List<String> list = Arrays.asList("zhang", "wang", "li");
        Optional<List<String>> list1 = Optional.ofNullable(list);
        Stream<List<String>> stream = list1.stream();
        System.out.println(stream.count());

        Stream<String> stringStream = list1.stream().flatMap(x -> x.stream());
        System.out.println(stringStream.count());
    }

}
