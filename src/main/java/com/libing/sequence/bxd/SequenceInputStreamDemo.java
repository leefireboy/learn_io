/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.sequence.bxd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * <P>
 * Description:SequenceInputStream 的使用
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月14日下午5:55:06
 */
public class SequenceInputStreamDemo {

    public static void main(String[] args) throws IOException {
        // 考虑效率因素基本不使用Vector
//        Vector<FileInputStream> vector = new Vector<FileInputStream>();
//        vector.add(new FileInputStream("count.properties"));
//        vector.add(new FileInputStream("demo.txt"));
//        vector.add(new FileInputStream("hello.txt"));
//        Enumeration<FileInputStream> en = vector.elements();

        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
        al.add(new FileInputStream("demo.txt"));
        al.add(new FileInputStream("count.properties"));
        al.add(new FileInputStream("hello.txt"));

//        final Iterator<FileInputStream> it = al.iterator();
//        Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
//
//            @Override
//            public boolean hasMoreElements() {
//                return it.hasNext();
//            }
//
//            @Override
//            public FileInputStream nextElement() {
//                return it.next();
//            }
//
//        };

        // enumeration(Collection<FileInputStream> c) 就是把上面的代码封装了
        Enumeration<FileInputStream> en = Collections.enumeration(al);

        SequenceInputStream sis = new SequenceInputStream(en);

        FileOutputStream fis = new FileOutputStream("1.properties");

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = sis.read(buf)) != -1) {
            fis.write(buf, 0, len);
        }

        sis.close();
        fis.close();
    }

}

