/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月1日上午11:44:58
 */
@SuppressWarnings("unused")
public class ByteStreamDemo {

    public static void main(String[] args) throws IOException {
        demo_read();
    }

    private static void demo_read() throws IOException {
        FileInputStream fis = new FileInputStream("demo.txt");
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }
        fis.close();
    }

    private static void demo_write() throws IOException {
        FileOutputStream fos = new FileOutputStream("demo.txt");
        fos.write("abcdefg".getBytes());
        fos.close();
    }

}

