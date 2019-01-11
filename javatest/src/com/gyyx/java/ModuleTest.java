package com.gyyx.java;

import com.gyyx.bean.Persion;
import com.gyyx.entity.Student;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * @author miaopeng
 * @date 2019/1/9 16:51
 */
public class ModuleTest {

    private static final Logger LOGGER = Logger.getLogger("aaaa");

    /**
     * @des
     * created by miaopeng on 2019/1/9 16:54
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        Persion persion = new Persion(1, "miao", 100f);
        System.out.println(persion);
        Student student = new Student();
    }

    @Test
    public void test () {
    }
}
