/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * <P>
 * Description:TODO
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月19日上午11:16:09
 */
public class TestTransForm1 {

    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\Administrator\\Desktop\\unicode.dat"));
            osw.write("abcdefghijklmnopqrstuvwxyz");
            System.out.println(osw.getEncoding());
            osw.close();
            osw = new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\Administrator\\Desktop\\unicode.dat", true), "utf-8");
            osw.write("abcdefghijklmnopqrstuvwxyz");
            System.out.println(osw.getEncoding());
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

