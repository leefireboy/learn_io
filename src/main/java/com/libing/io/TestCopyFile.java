/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <P>
 * Description:实现拷贝本文件到指定文件
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月17日下午10:58:44
 */
public class TestCopyFile {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        int c = 0;
        try {
            fr = new FileReader("C:\\Users\\Administrator\\workspace"
                        + "\\learn_io\\src\\main\\java\\com\\libing\\io\\TestCopyFile.java");
            fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\unicode.dat");
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            fr.close();
            fw.flush();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到");
        } catch (IOException e) {
            System.out.println("文件读写错误");
        }
    }

}

