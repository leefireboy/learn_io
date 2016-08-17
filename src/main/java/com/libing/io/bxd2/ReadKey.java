/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd2;

import java.io.IOException;
import java.io.InputStream;

/**
 * <P>
 * Description:读取控制台输入，并打印到控制台
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月1日下午3:06:04
 */
public class ReadKey {

    public static void main(String[] args) throws IOException {
        readKey2();
    }

    /**
     *
     * @Title: readKey2
     * @Description: 获取键盘输入，转换为大写显示，如果输入 over 结束键盘输入
     * @param @throws IOException    设定文件
     * @return void    返回类型
     * @throws
     */
    public static void readKey2() throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStream is = System.in;
        int ch = 0;
        while ((ch = is.read()) != -1) {
            if ('\r' == ch) {
                continue;
            }
            if ('\n' == ch) {
                String str = sb.toString();
                if ("over".equals(str)) {
                    break;
                }
                System.out.println(str.toUpperCase());
                sb.delete(0, sb.length());
            } else {
                sb.append((char)ch);
            }
        }
    }

    public static void readKey() throws IOException {
        InputStream is = System.in;
        int ch = is.read();
        System.out.println(ch);
    }

}
