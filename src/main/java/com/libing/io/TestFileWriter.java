/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * <P>
 * Description:实现写入 unicode 前 0~50000 个字符
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月17日下午10:51:24
 */
public class TestFileWriter {

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\unicode.dat");
            for (int c = 0; c <= 50000; c++) {
                fw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件写入错误");
            System.exit(-1);
        }
    }

}

