/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.FileReader;
import java.io.IOException;

/**
 * <P>
 * Description:读取一个文件，把内容打印到控制台
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月24日下午5:53:49
 */
public class FileReaderDemo {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            System.out.println((char)ch);
        }
        fr.close();
    }

}

