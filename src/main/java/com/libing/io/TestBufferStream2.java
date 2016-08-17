/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <P>
 * Description:实现写入100行随机数并且输出到控制台
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月17日下午11:30:39
 */
public class TestBufferStream2 {

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\Administrator\\Desktop\\unicode.dat"));
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\Administrator\\Desktop\\unicode.dat"));
            String s = null;
            for (int i = 1; i <= 100; i++) {
                s = String.valueOf(Math.random() * 100);
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

