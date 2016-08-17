/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月25日下午4:56:21
 */
public class BufferedWriterDemo {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("demo.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("abcdef" + LINE_SEPARATOR + "ghijklmn");
        bw.flush();
        bw.close();
    }

}