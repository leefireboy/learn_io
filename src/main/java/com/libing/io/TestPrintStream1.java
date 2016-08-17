/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月23日上午10:10:55
 */
public class TestPrintStream1 {

    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\unicode.dat");
            ps = new PrintStream(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (ps != null) {
            System.setOut(ps);
        }
        int ln = 0;
        for (char c = 0; c <= 60000; c++) {
            System.out.print(c + " ");
            if (ln++ >= 100) {
                System.out.println();
                ln = 0;
            }
        }
    }

}