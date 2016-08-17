/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.FileWriter;
import java.io.IOException;

/**
 * <P>
 * Description:IO流异常的处理
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月24日下午4:57:11
 */
public class IOExceptionDemo {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("demo.txt", true);
            fw.write("haha" + LINE_SEPARATOR + "xixi");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
            }
        }
    }

}

