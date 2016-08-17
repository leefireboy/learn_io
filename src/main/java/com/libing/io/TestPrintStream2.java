/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月23日上午11:17:28
 */
public class TestPrintStream2 {

    public static void main(String[] args) {
        String filename = "C:\\Users\\Administrator\\Desktop\\unicode.dat";
        if (filename != null) {
            list(filename, System.out);
        }
    }

    private static void list(String filename, PrintStream out) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String s = null;
            while ((s = br.readLine()) != null) {
                out.print(s);
                out.println();
            }
            br.close();
        } catch (Exception e) {
            out.print("无法读取文件");
        }
    }

}

