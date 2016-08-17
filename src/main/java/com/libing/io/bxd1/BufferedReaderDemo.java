/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * <P>
 * Description:练习BufferedReader
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月26日上午9:27:02
 */
public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        BufferedReader br = new BufferedReader(fr);
        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }

    public static void demo() throws IOException {
        FileReader fr = new FileReader("demo.txt");
        char[] buf = new char[1024];
        int len = 0;
        while ((len = fr.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }
        fr.close();
    }

}
