/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <P>
 * Description:复制 mp3 文件
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月1日下午12:00:39
 */
@SuppressWarnings("unused")
public class CopyMp3Test {

    public static void main(String[] args) throws IOException {
        copy_4();
    }

    // 效率太低，不要使用
    private static void copy_4() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Documents\\Music\\Katy Perry - Firework.mp3");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1.mp3");
        int ch = 0;
        while ((ch = fis.read()) != -1) {
            fos.write(ch);
        }
        fis.close();
        fos.close();
    }

    private static void copy_3() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Documents\\Music\\Katy Perry - Firework.mp3");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1.mp3");
        byte[] buf = new byte[fis.available()];
        fis.read(buf);
        fos.write(buf);
        fis.close();
        fos.close();
    }

    public static void copy_2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Documents\\Music\\Katy Perry - Firework.mp3");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1.mp3");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int ch = 0;
        while ((ch = bis.read()) != -1) {
            bos.write(ch);
        }
        bis.close();
        bos.close();
    }

    public static void copy_1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Documents\\Music\\Katy Perry - Firework.mp3");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1.mp3");
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        fis.close();
        fos.close();
    }

}

