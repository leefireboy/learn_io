/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * <P>
 * Description:实现控制台输出本文件
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月17日下午10:39:56
 */
public class TestFileReader {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\Administrator\\workspace"
                    + "\\learn_io\\src\\main\\java\\com\\libing\\io\\TestFileReader.java");
            int ln = 0;
            while((ln = fr.read()) != -1) {
                System.out.print((char)ln);
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
        } catch (IOException e) {
            System.out.println("文件读取错误");
        }
    }

}

