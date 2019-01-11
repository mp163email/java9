package com.gyyx.java;

/**
 * jdk9中的接口，可以使用私有方法
 * 接口和抽象类的区别， 单继承，多实现
 * 接口中可以指定抽象方法，（默认方法，私有方法），静态方法
 */
public interface Inter9 {

    void test ();

    default void test1 () {
        System.out.println("test1");
        test();
    }

    /**
     * 私有方法为的是让接口中的default方法去调用
     */
    private void test2 () {
        System.out.println("test2");
    }

    /**
     * 静态方法
     */
    static void test3 () {
        System.out.println("test3");
    }

}
