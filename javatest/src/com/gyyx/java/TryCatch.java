package com.gyyx.java;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * des: try-catch的改进
 * created by miapoeng on 2019/1/11 10:18
 */
public class TryCatch {

    /**
     * 手动写finally, 并在finally里手动关闭资源
     */
    public void jdk6() {
        InputStreamReader reader = new InputStreamReader(System.in);
        try {
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 不再需要手动写finally和close方法
     * 但是需要将自动关闭的资源写到try()的括号中
     */
    public void jdk8 () {
        try(InputStreamReader reader = new InputStreamReader(System.in)) {
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * try里面可以放对象，不用把整行定义都放进去
     * 多个要关闭的对象用分号分开
     */
    public void jdk9 () {
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try(reader;writer) {
            reader.read();
            writer.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
