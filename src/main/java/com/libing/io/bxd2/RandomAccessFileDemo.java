/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd2;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月22日上午9:42:37
 */
public class RandomAccessFileDemo {

    public static void main(String[] args) throws IOException {
//        writeFile();
        readFile();
    }

    public static void readFile() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("demo.txt", "r");

        byte[] buf = new byte[8];
        raf.read(buf);
        String name = new String(buf);
        int age = raf.readInt();

        System.out.println("name=" + name);
        System.out.println("age=" + age);

        raf.close();
    }

    public static void writeFile() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("demo.txt", "rw");
        raf.write("zhangsan".getBytes());
        raf.writeInt(97);
        raf.close();
    }

}
