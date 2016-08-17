/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <P>
 * Description:TODO
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月25日上午10:48:43
 */
public class CopyTextTest2 {

    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("demo.txt");
            fw = new FileWriter("demo1.txt");
            char[] buf = new char[BUFFER_SIZE];
            int len = 0;
            while ((len = fr.read(buf)) != -1) {
                fw.write(buf, 0, len);
            }
        } catch (Exception e) {
            throw new RuntimeException("读写失败");
        } finally {
            if (null != fr) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fw) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
