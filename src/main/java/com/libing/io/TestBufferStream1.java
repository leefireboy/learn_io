/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * <P>
 * Description:实现缓冲流的使用
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月17日下午11:24:19
 */
public class TestBufferStream1 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\unicode.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int c = 0;
            System.out.println(bis.read());
            System.out.println(bis.read());
            bis.mark(100);
            for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
                System.out.print(c + " ");
            }
            System.out.println();
            bis.reset();
            for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
                System.out.print(c + " ");
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

