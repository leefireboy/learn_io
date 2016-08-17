/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <P>
 * Description:文件复制
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月25日上午10:40:01
 */
public class CopyTextTest {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        FileWriter fw = new FileWriter("demo1.txt");
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }

}

