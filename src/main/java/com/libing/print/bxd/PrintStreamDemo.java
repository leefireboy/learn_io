/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.print.bxd;

import java.io.IOException;
import java.io.PrintStream;

/**
 * <P>
 * Description:打印流
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月14日下午4:19:29
 */
public class PrintStreamDemo {

    public static void main(String[] args) throws IOException {
        // 提供了多种数据类型的打印方法，并保持数据的表示形式，不会抛出 IOException
        // 构造器：字符串路径，File对象，字节输出流
        PrintStream ps = new PrintStream("hello.txt");
        ps.println(1);
        ps.close();
    }

}

