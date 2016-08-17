/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <P>
 * Description:使用缓冲流实现文件的复制
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月26日下午2:33:02
 */
public class CopyTextByBufTest {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("demo1.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String str = null;
        while ((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
            bw.flush();
        }

//        int ch = 0;
//        while ((ch = br.read()) != -1) {
//            bw.write(ch);
//        }

        br.close();
        bw.close();
    }

}

