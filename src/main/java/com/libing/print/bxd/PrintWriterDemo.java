/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.print.bxd;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * <P>
 * Description:字符打印流
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月14日下午4:49:28
 */
public class PrintWriterDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
         * 构造函数参数：
         * 1、字符串路径
         * 2、File 对象
         * 3、字节输出流
         * 4、字符输出流
         */
        PrintWriter pw = new PrintWriter(new FileWriter("hello.txt"), true);

        String line = null;
        while ((line = br.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
            pw.println(line.toUpperCase());
//            pw.flush();
        }

        pw.close();
        br.close();
    }

}

