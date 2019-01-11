package com.gyyx.java;

/**
 * des:
 * created by miapoeng on 2019/1/11 11:01
 */
public class StringChange {

    /**
     * jdk8之前由char[]存储
     * jdk9之后由byte[]存储
     * 因为好多字符串是存的是拉丁文，用一个字节足够，可以省一半的空间。
     * 但是汉子的时候，指定成utf-16, 这时候，每个char都是2个字节
     * 其他编码是iso-8859-1 或者 lastin-l
     *
     * 相同点：内部存储结构是一样的
     * String  不可变的字符序列（String一旦改变就会重新new一个新对象，就对象被回收，所以慢）
     * StringBuffer 可变的字符序列  线程安全的
     * StringBuilder 可变的字符序列  非线程安全的
     */
    public void test () {
        String str = "";
    }


}
